package JavaBasico.atividades_trabalhando_com_colecoes_dados.entities;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    private LocalDate expirationDate;

    public ProdutoPerecivel(String name, Double price, Integer quantity, LocalDate expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
