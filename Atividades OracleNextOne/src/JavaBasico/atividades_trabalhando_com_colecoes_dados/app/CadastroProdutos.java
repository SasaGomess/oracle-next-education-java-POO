package JavaBasico.atividades_trabalhando_com_colecoes_dados.app;

import JavaBasico.atividades_trabalhando_com_colecoes_dados.entities.Produto;
import JavaBasico.atividades_trabalhando_com_colecoes_dados.entities.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CadastroProdutos {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>(List.of(new Produto("Sabonete", 12.99, 2), new ProdutoPerecivel("Carne - Patinho muido", 40.50, 1, LocalDate.parse("2025-12-02")), new Produto("Capinha Celular", 20.99, 1)));

        System.out.println("O tamanho da lista é: " + produtos.size());

        System.out.println("O segundo produto da lista de compras é: " + produtos.get(1));

        for (Produto p : produtos){
            if (p instanceof ProdutoPerecivel){
                System.out.println(p +", e sua data de validade é " + ((ProdutoPerecivel) p).getExpirationDate());
            }else {
                System.out.println(p);
            }
            
        }


    }
}
