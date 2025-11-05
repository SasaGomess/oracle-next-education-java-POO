package JavaBasico;

import java.time.LocalDate;

public class Condicional {
    public static void main(String[] args) {
        String filme = "InterStelar";
        LocalDate dataLancamento = LocalDate.parse("2011-06-07");
        boolean incluidoOuNao = true;
        double nota = 8.3;
        String tipoPlano = "plus";

        if (dataLancamento.getYear() <= 2010){
            System.out.println("Filmes retrôs que os clientes ainda gostam!");
            System.out.println(filme);
        } else {
            System.out.println("Lançamentos que os clientes amam!");
            System.out.println(filme);
        }

        if(incluidoOuNao || tipoPlano.equalsIgnoreCase("plus") ){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Você deve pagar a alocação");
        }

        
    }
}
