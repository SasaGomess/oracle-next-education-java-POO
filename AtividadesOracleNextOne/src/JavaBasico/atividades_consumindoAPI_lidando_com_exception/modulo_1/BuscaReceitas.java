package JavaBasico.atividades_consumindoAPI_lidando_com_exception.modulo_1;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BuscaReceitas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma receita para visualizar o passo a passo ");
        var buscaReceita = sc.nextLine();

        var buscaReceitaCodificada = URLEncoder.encode(buscaReceita, StandardCharsets.UTF_8);

        var endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + buscaReceitaCodificada;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
