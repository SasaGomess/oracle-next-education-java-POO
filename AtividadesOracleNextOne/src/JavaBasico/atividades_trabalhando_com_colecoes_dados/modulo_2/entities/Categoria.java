package JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_2.entities;

public enum Categoria {
    ALIMENTICIO(1),
    LIMPEZA(2),
    COSMETICOS(3),
    FARMACEUTICOS(4);

    private double dig;

    Categoria(double dig){
        this.dig = dig;
    }

    public double getDig() {
        return dig;
    }
}
