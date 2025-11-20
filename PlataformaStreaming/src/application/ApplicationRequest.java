package application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Titulo;
import model.TituloOmdbDto;

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
        var apiKey = System.getenv("OMDB_API_KEY");

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey="+ apiKey;

        HttpClient client = HttpClient.newHttpClient();

        // Aqui eu faço a minha requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Aqui eu obtenho a resposta da requisição, apartir da requisição enviada pelo client
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        var json = response.body();

        System.out.println(json);
        //Utilizando um Gson Builder para sinalizar que a politica de nomenclatura das chaves do Json é em Uppercase
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        //Titulo titulo = gson.fromJson(json, Titulo.class);

        TituloOmdbDto titulo = gson.fromJson(json, TituloOmdbDto.class);
        System.out.println(titulo);

        Titulo meuTitulo = new Titulo(titulo);
        System.out.println();
        System.out.println(meuTitulo);

    }
}
