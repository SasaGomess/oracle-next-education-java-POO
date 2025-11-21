package model.service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.TituloOmdbDto;

public class TituloConversor {

    public TituloOmdbDto tituloConversor(String json){
        //Utilizando um Gson Builder para sinalizar que a politica de nomenclatura das chaves do Json é em Uppercase
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        return gson.fromJson(json, TituloOmdbDto.class);
    }
}
