package JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_2.entities;

public class Quadrado implements Forma {
    private int medidaLado ;

    public Quadrado(int medidaLado) {
        this.medidaLado = medidaLado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(medidaLado , 2);
    }
}
