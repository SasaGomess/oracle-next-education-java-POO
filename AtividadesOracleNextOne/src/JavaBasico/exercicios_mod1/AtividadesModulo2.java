package JavaBasico.exercicios_mod1;

public class AtividadesModulo2 {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        double n1 = 5.5;
        double n2 = 7.8;

        System.out.printf("O valor da média é %.2f %n", ((n1 + n2) / 2));

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double v1  = 22.50;
        int v2 = (int) v1;

        System.out.println(v2);

        // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'O';
        String palavra = " Macarrão";

        System.out.println(letra + palavra);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 14.90;
        int quantidade = 3;

        double precoTotal = precoProduto * quantidade;
        System.out.println(precoTotal);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorDolares = 5.60;
        double inflacao = 4.94;

        double converssao = valorDolares * inflacao;

        System.out.println(converssao);

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 254.70;
        double percentualDesconto = 0.10;

        double valorDesconto = precoOriginal * percentualDesconto;

        double total = precoOriginal - valorDesconto;

        System.out.printf("%.2f", total);



    }
}
