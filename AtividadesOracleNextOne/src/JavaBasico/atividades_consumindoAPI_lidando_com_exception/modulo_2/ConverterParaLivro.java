package JavaBasico.atividades_consumindoAPI_lidando_com_exception.modulo_2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverterParaLivro {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).serializeNulls().create();

        String json = """
                {
                    "Titulo" : "A Revolução dos Bichos",
                    "Autor" : "George Orwell",
                    "Editora" : {
                        "NomeEditora" : "Grupo Companhia das Letras",
                        "EnderecoEditora": "Praça Floriano, 19, Centro, Rio de Janeiro, RJ, Brasil"
                    }
                }
                """;

        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);
    }
}
