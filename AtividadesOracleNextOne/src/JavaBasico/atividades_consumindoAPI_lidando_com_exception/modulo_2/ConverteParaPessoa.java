package JavaBasico.atividades_consumindoAPI_lidando_com_exception.modulo_2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverteParaPessoa {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).serializeNulls().create();

        String json = """
               {
                "Nome" : "Maria",
                "Idade" : 18,
                "Cidade" : "São Bernardo do Campo",
                "Nacionalidade" : "Brasileira"
               }
               """;

        PessoaDTO pessoaDto = gson.fromJson(json, PessoaDTO.class);

        System.out.println("Informações da pessoa: ");

        Pessoa pessoa = new Pessoa(pessoaDto, "344.355.237-87");

        System.out.println(pessoa);

    }
}
