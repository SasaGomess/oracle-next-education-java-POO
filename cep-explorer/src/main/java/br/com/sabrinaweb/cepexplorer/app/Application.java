package br.com.sabrinaweb.cepexplorer.app;

import br.com.sabrinaweb.cepexplorer.client.ViaCepClient;
import br.com.sabrinaweb.cepexplorer.client.AddressDto;
import br.com.sabrinaweb.cepexplorer.model.Address;
import br.com.sabrinaweb.cepexplorer.service.AddressConverter;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ViaCepClient client = new ViaCepClient();
        AddressConverter converter = new AddressConverter(new GsonBuilder().setPrettyPrinting().create());

        String resp = "";

        try {
            while (!resp.equalsIgnoreCase("sair")) {

                System.out.println("Digite um cep para procurar");
                String busca = sc.nextLine();

                String json = client.getAddress(busca);

                AddressDto addressDto = converter.jsonToAddress(json);

                System.out.println("O endereço achado pelo cep é: ");

                System.out.println(addressDto);

                System.out.println("Digite a unidade/número do endereco: ");
                Integer unidade = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite o complemento: ");
                var complemento = sc.nextLine();

                Address address = new Address(addressDto, unidade, complemento);

                System.out.println(address);

                String addressJson = converter.addressToJson(address);

                converter.fileJsonGenerator(addressJson);

                System.out.println("**Digite qualquer letra** se você deseja cadastrar mais um endereço ou **sair** se deseja encerrar o programa");
                resp = sc.nextLine();

            }
            System.out.println("Programa encerrado. O seu Cep está salvo no arquivo meus_enderecos.json :)");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
            System.out.println("Ocorreu um erro o CEP estava inválido. Encerrando programa...");
        }

    }
}
