package JavaBasico.exercicios_mod2.exercicio_2;

import java.time.LocalDate;

public class Carro {
    private String modelo;
    private String nomeVeiculo;
    private Double preco;
    private LocalDate dataLancamento;

    public Carro(String modelo, String nomeVeiculo, Double preco) {
        this.modelo = modelo;
        this.nomeVeiculo = nomeVeiculo;
        this.preco = preco;
    }

    public void modeloEmTresAnos(String especificacao){
        if (dataLancamento.getYear() - LocalDate.now().getYear() <= 3){
            modelo = especificacao;
        }
    }
    public void calculaPrecoMedioAno(){
        if (dataLancamento.plusYears(1).equals(LocalDate.now())){
            double valorReajuste = preco * 0.03;
            this.preco = preco - valorReajuste;
        }
    }

    public String defineNomeModelo(){
        return this.nomeVeiculo.concat(modelo);
    }

}
