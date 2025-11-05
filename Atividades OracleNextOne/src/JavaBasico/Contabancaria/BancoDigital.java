package JavaBasico.Contabancaria;

public class BancoDigital {
    public static void main(String[] args) {
        ContaBancaria contaCliente1 = new ContaBancaria("Jacqueline Oliveira", "Corrente", 2500.00);
        contaCliente1.extratoBancario();
        MenuOperacoes.menu(contaCliente1);
        System.out.println("Encerrando...");
    }
}
