package JavaBasico.Contabancaria;

public class ContaBancaria {
    private String nomeCliente;
    private String tipoConta;
    private Double saldo;

    public ContaBancaria(String nomeCliente, String tipoConta, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void consultarSaldo(){
        System.out.printf("O saldo atual é R$ %.2f %n", saldo);
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void valorReceber(double valor){
        this.saldo += valor;
        System.out.printf("Saldo atualizado R$ %.2f %n", saldo);
    }

    public void valorTransferir(double valor){
        if (valor > saldo){
            throw new IllegalArgumentException("Não há saldo suficiente para fazer essa transferência");
        }else {
            this.saldo -= valor;
            System.out.printf("Saldo atualizado R$ %.2f %n", saldo);
        }
    }

    public void extratoBancario(){
        System.out.println("*****************************************");
        System.out.println("\nDados do cliente");
        System.out.println("Nome:             " + nomeCliente);
        System.out.println("Tipo Conta:       " + tipoConta);
        System.out.printf("Saldo:            R$ %.2f %n",  saldo);
        System.out.println("\n*****************************************");
    }
}
