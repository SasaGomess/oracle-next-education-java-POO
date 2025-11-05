package JavaBasico;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao jogo de advinhação da Sasa. Você possui 5 tentativas");
        int aleatorio = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);
        boolean ganhou = false;


        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite sua %d° tentativa", (i + 1));
            int valorUsuario = sc.nextInt();

            if (valorUsuario == aleatorio){
                ganhou = true;
                break;
            } else if (valorUsuario < aleatorio) {
                System.out.println("O valor aleatorio é maior");
            } else {
                System.out.println("O valor aleatorio é menor");
            }
        }
        if (ganhou){
            System.out.println("Você ganhou parabéns o numero aleatorio era: " + aleatorio);
        }else {
            System.out.println("Que pena :( você perdeu o numero aleatorio era: " + aleatorio);
        }
    }
}
