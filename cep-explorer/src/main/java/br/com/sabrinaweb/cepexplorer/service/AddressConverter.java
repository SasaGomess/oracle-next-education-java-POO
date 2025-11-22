package br.com.sabrinaweb.cepexplorer.service;

import br.com.sabrinaweb.cepexplorer.client.AddressDto;
import br.com.sabrinaweb.cepexplorer.model.Address;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class AddressConverter {


    private Gson gson;

    public AddressConverter(Gson gson){
        this.gson = gson;
    }

    public String addressToJson(Address address){
       return gson.toJson(address);
    }
    public AddressDto jsonToAddress(String json){
       return gson.fromJson(json, AddressDto.class);
    }

    public void fileJsonGenerator(String json, Address address){
        try (FileWriter writer = new FileWriter(address.getCep() + "_meu_cep" + ".json")){
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
