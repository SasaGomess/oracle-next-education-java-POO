package JavaBasico.exercicios_mod1;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em graus Celsius no seu pais no dia de hoje");
        int C = sc.nextInt();

        double F = (C * 1.8) + 32;

        System.out.printf("O valor da temperatura do seu país em Fahrenheit é %.2f", F);
    }
}
