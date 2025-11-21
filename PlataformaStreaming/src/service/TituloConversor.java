package service;

import com.google.gson.Gson;
import model.Titulo;
import client.dto.TituloOmdbDto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TituloConversor {

    private Gson gson;

    public TituloConversor(Gson gson){
        this.gson = gson;
    }

    public TituloOmdbDto tituloJsonToObject(String json){
        return gson.fromJson(json, TituloOmdbDto.class);
    }

    public void tituloObjectToJson(List<Titulo> titulos) {
        try (FileWriter writer = new FileWriter("titulos.json");){
            writer.write(gson.toJson(titulos));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
