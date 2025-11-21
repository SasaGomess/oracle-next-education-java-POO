package client;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class TituloRequest {
    public String findTitulo(String busca) throws IOException, InterruptedException {
        var apiKey = System.getenv("OMDB_API_KEY");

        //Tratando busca para formatos em uma URL
        var buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

        String endereco = "http://www.omdbapi.com/?t=" + buscaCodificada + "&apikey="+ apiKey;

        HttpClient client = HttpClient.newHttpClient();

        // Aqui eu faço a minha requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Aqui eu obtenho a resposta da requisição, apartir da requisição enviada pelo client
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
