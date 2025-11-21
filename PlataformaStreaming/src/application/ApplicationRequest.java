package application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Titulo;
import model.TituloOmdbDto;
import model.exception.ConversaoDeAnoInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ApplicationRequest {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual título você busca?");
        var busca = sc.nextLine();
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

        var json = response.body();

        System.out.println(json);
        
        //Utilizando um Gson Builder para sinalizar que a politica de nomenclatura das chaves do Json é em Uppercase
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        //Titulo titulo = gson.fromJson(json, Titulo.class);
        TituloOmdbDto titulo = gson.fromJson(json, TituloOmdbDto.class);
        //System.out.println(titulo);
        System.out.println();
        try{
            Titulo meuTitulo = new Titulo(titulo);
            System.out.println();
            System.out.println(meuTitulo);
            System.out.println();
        }catch (NumberFormatException | ConversaoDeAnoInvalidoException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }
        System.out.println("O programa finalizou");

    }
}
