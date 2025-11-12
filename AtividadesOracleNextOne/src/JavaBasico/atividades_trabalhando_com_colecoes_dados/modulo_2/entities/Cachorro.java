package JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_2.entities;

public class Cachorro extends Animal{

    @Override
    public void andar(){
        System.out.println("Cachorro andando");
    }
    public void latir(){
        System.out.println("Au Au!");
    }
}
