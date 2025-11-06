package JavaBasico.exercicios_mod1;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // operadores de incremento pré-incremento a variável é incrementada antes de ser usada ou atribuida
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        // pos-incremento a variavel é atribuida ou usada antes de ser incrementada
        int num1 = 5;
        int resultado1 = num1++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num1); // imprime 6
        System.out.println(resultado1); // imprime 5
    }
}