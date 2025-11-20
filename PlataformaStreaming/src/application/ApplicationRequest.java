package application;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApplicationRequest {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual filme você busca?");
        var busca = sc.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=b831fd54";

        HttpClient client = HttpClient.newHttpClient();

        // Aqui eu faço a minha requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Aqui eu obtenho a resposta da requisição, apartir da requisição enviada pelo client
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
