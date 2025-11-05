package JavaBasico.Contabancaria;

import java.util.Scanner;

public class MenuOperacoes {
    private static Scanner sc = new Scanner(System.in);

    private static void mostrarOperacoes(){

        System.out.println("\nOperacoes");
        System.out.println("\n1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Gerar Extrato Bancario");
        System.out.println("5 - Sair");
        System.out.println("\nDigite a opção desejada: ");
    }
    public static void menu(ContaBancaria contaBancaria){

        mostrarOperacoes();
        int resp = sc.nextInt();

        while (resp != 5 ){

            switch (resp){
                case 1:
                    contaBancaria.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor a receber");
                    double valorPix = sc.nextDouble();
                    contaBancaria.valorReceber(valorPix);
                    break;
                case 3:
                    try {

                    System.out.println("Digite o valor de transferencia");
                    double valorPixAfazer = sc.nextDouble();
                    contaBancaria.valorTransferir(valorPixAfazer);

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    contaBancaria.extratoBancario();
                    break;
                default:
                    System.out.println("Opção inválida digite um n° que corresponda a uma das operações");
            }
            mostrarOperacoes();
            resp = sc.nextInt();
        };

    }

}
