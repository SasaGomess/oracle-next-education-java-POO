package br.com.sabrinaweb.cepexplorer.client;

import br.com.sabrinaweb.cepexplorer.model.Address;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepClient {
    public Address getAddress(String busca) throws IOException, InterruptedException {

        var buscaCodificada = validaCep(busca);

        String endereco = "viacep.com.br/ws/"+ buscaCodificada + "/json/";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return new GsonBuilder().create().fromJson(response.body(), Address.class);
    }

    private String validaCep(String busca) {
        if (busca.length() > 8){
            System.out.println("CEP incorreto você deve passar números com até 8 caracteres");
        }
        return busca;
    }
}
