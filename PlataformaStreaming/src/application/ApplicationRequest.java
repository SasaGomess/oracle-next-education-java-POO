package application;

import model.Titulo;
import model.service.TituloConversor;
import model.TituloOmdbDto;
import model.service.TituloRequest;
import model.exception.ConversaoDeAnoInvalidoException;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

import java.util.stream.Stream;

public class ApplicationRequest {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        TituloRequest request = new TituloRequest();
        TituloConversor conversor = new TituloConversor();
        Titulo meuTitulo;

        System.out.println("Qual título você busca?");
        var busca = sc.nextLine();

        var json = request.findTitulo(busca);

        System.out.println(json);

        TituloOmdbDto tituloOmdbDto = conversor.tituloConversor(json);

        System.out.println();

        try{
            meuTitulo = new Titulo(tituloOmdbDto);
        }catch (ConversaoDeAnoInvalidoException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());

            String[] duasDatas = tituloOmdbDto.year().split("–");
            Integer dataInicial = Integer.parseInt(duasDatas[0]);

            meuTitulo = new Titulo(tituloOmdbDto, dataInicial);
        }
        System.out.println(meuTitulo);
        System.out.println("O programa finalizou");
    }
}
