package JavaBasico.exercicios_mod2.exercicio_3;

public class VerificadorNumeroPrimo extends NumerosPrimos{
    public boolean verificarSeHaPrimo(){
        boolean primo = false;
        for (Integer numero : super.numeros){
            if (numero % 3 == 0 || numero % 5 ==0 || numero % 7 == 0){
                primo = true;
            }
        }
        return primo;
    }
}
