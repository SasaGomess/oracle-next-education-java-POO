package application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import model.Titulo;
import service.TituloConversor;
import client.dto.TituloOmdbDto;
import client.TituloRequest;
import exception.ConversaoDeAnoInvalidoException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRequest {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        TituloRequest request = new TituloRequest();
        TituloConversor conversor = new TituloConversor(new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create());
        Titulo meuTitulo;
        List<Titulo> titulos = new ArrayList<>();
        var busca = "";

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Qual título você busca?");
            busca = sc.nextLine();

            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            var json = request.findTitulo(busca);

            TituloOmdbDto tituloOmdbDto = conversor.tituloJsonToObject(json);

            System.out.println();

            try {
                meuTitulo = new Titulo(tituloOmdbDto);
            } catch (ConversaoDeAnoInvalidoException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
                System.out.println("Pegando a data inicial, para criar um titulo");
                String[] duasDatas = tituloOmdbDto.year().split("–");
                Integer dataInicial = Integer.parseInt(duasDatas[0]);

                meuTitulo = new Titulo(tituloOmdbDto, dataInicial);
            }
            titulos.add(meuTitulo);
            System.out.println(meuTitulo);
        }
            titulos.forEach(System.out::println);
            conversor.tituloObjectToJson(titulos);
            System.out.println("O programa finalizou");
        }
    }
