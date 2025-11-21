package JavaBasico.atividades_consumindoAPI_lidando_com_exception.modulo_2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pessoa {
    private String nome;
    private Integer idade;
    private String cidade;
    private String cpf;

    public Pessoa(PessoaDTO pessoaDTO, String cpf){
        this.nome = pessoaDTO.nome();
        this.idade = pessoaDTO.idade();
        this.cidade = pessoaDTO.cidade();
        this.cpf = cpf;
    }
}
