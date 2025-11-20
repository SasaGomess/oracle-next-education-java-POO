package JavaBasico.atividades_consumindoAPI_lidando_com_exception.modulo_1;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BuscaMoedas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da CryptoMoeda que deseja pesquisar: Ex: (bitcoin, ethereum, tether, cardano, XRP e dogecoin)");

        var cryptoId = sc.nextLine();

        var cryptoIdCodificado = URLEncoder.encode(cryptoId, StandardCharsets.UTF_8);
        var apiKey = System.getenv("CG_DEMO_API_KEY");

        var endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + cryptoIdCodificado + "&vs_currencies=brl&x-cg-demo-api-key="+ apiKey;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Valor da cotação em BRL");
        System.out.println(response.body());

    }
}
