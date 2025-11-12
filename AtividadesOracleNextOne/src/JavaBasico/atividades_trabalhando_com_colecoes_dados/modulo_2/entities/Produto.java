package JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_2.entities;

import java.util.Objects;

public class Produto {
    private String name;
    private Double preco;
    private Categoria categoria;

    public Produto(String name, Double preco, double categoria) {
        this.name = name;
        this.preco = preco;
        if (categoria == 1){
            this.categoria = Categoria.ALIMENTICIO;
        }
        else if (categoria == 2){
            this.categoria = Categoria.LIMPEZA;
        }
        else if (categoria == 3){
            this.categoria = Categoria.COSMETICOS;
        }
        else if (categoria == 4){
            this.categoria = Categoria.FARMACEUTICOS;
        }
    }

    public Produto() {
    }

    public String getName() {
        return name;
    }

    public Double getPreco() {
        return preco;
    }
    public double precoTotal(){
        var taxa = 0.0;
        var precoTotal = 0.0;

        if (categoria.getDig() == 1){
            taxa = preco * 0.02;
            precoTotal = preco + taxa;
        }
        if (categoria.getDig() == 2){
            taxa = preco * 0.03;
            precoTotal = preco + taxa;
        }
        if (categoria.getDig() == 3){
            taxa = preco * 0.10;
            precoTotal = preco + taxa;
        }
        if (categoria.getDig() == 4){
            taxa = preco * 0.10;
            precoTotal = preco + taxa;
        }

        return precoTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(preco, produto.preco) && categoria == produto.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(preco, categoria);
    }
}
