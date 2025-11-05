package JavaBasico;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;
        int totalNotasDigitadas = 0;

        while (nota != -1) {
            System.out.println("Digite a sua nota para o filme ou -1 para sair ");
            nota = sc.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotasDigitadas++;
            }
        }
        if (totalNotasDigitadas == 0){
            System.out.printf("Você não avaliou ");
        }else {
            System.out.printf("Media de avaliação foi: %.2f", (mediaAvaliacao / totalNotasDigitadas));
        }



    }
}
