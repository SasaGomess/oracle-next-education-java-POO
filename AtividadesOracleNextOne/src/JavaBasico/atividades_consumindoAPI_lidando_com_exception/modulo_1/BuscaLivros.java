package JavaBasico.atividades_consumindoAPI_lidando_com_exception.modulo_1;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BuscaLivros {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual volume você busca? ");
        var busca = sc.nextLine();
        var buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

        var endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscaCodificada + "&maxResults=1&filter=free-ebooks";
        URI uri = URI.create(endereco);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
