package JavaBasico.atividades_trabalhando_com_colecoes_dados.entities;

public class Produto {
    private String name;
    private Double price;
    private Integer quantity;

    public Produto(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("O nome do produto é %s com preço de R$ %.2f e QTD %d", name, price, quantity);
    }
}
