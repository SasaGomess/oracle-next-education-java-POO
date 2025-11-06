package JavaBasico.exercicios_mod1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a %d nota para o filme ", (i+1));
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.printf("Media de avaliação foi: %.2f", (mediaAvaliacao / 3));
    }
}
