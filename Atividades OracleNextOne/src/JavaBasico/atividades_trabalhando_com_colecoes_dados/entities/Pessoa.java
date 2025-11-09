package JavaBasico.atividades_trabalhando_com_colecoes_dados.entities;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("O nome dessa pessoa é %s, tem %d anos e seu cpf é %s", nome, idade, cpf);
    }

    public static final class PessoaBuilder {
        private String nome;
        private int idade;
        private String cpf;

        private PessoaBuilder() {
        }

        public static PessoaBuilder aPessoa() {
            return new PessoaBuilder();
        }

        public PessoaBuilder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder withIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public PessoaBuilder withCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Pessoa build() {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setIdade(idade);
            pessoa.setCpf(cpf);
            return pessoa;
        }
    }
}
