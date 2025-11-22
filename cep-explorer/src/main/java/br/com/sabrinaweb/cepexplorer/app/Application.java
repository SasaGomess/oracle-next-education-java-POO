package br.com.sabrinaweb.cepexplorer.app;

import br.com.sabrinaweb.cepexplorer.client.ViaCepClient;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ViaCepClient client = new ViaCepClient();

        System.out.println("Digite um cep para procurar");
        String busca = sc.nextLine();
        client.getAddress(busca);

    }
}
