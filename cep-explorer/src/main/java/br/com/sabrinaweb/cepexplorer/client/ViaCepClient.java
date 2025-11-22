package br.com.sabrinaweb.cepexplorer.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepClient {
    public String getAddress(String busca) {

        var buscaCodificada = validaCep(busca);

        String endereco = "https://viacep.com.br/ws/" + buscaCodificada + "/json";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.body().contains("\"erro\": \"true\"") ){
                throw new IllegalStateException("Não é possível obter o endereço pois o cep passado é inválido ou não existe");
            }

            return response.body();
        } catch (IOException | InterruptedException  e){
            throw new RuntimeException(e.getMessage());
        }
    }

    private String validaCep(String busca) {
        if (busca.replace(" ", "").length() > 8) {
            throw new IllegalArgumentException("CEP incorreto você deve passar números com até 8 caracteres");
        }else if (busca.contains(" ")){
           return busca.replace(" ", "");
        } else if (busca.matches(".*[^0-9].*")){
            throw new IllegalArgumentException("CEP incorreto você deve passar um CEP sem caracteres especiais e sem letras");
        }
        return busca;
    }
}
