package br.com.sabrinaweb.cepexplorer.model;

import br.com.sabrinaweb.cepexplorer.client.AddressDto;
import lombok.Value;

@Value
public class Address {
    String cep;
    String logradouro;
    String complemento;
    String estado;
    String bairro;
    Integer unidade;
    String localidade;
    String regiao;

    public Address(AddressDto dto, Integer unidade, String complemento){
        this.bairro = dto.bairro();
        this.cep = dto.cep();
        this.regiao = dto.regiao();
        this.unidade = unidade;
        this.localidade = dto.localidade();
        this.logradouro = dto.logradouro();

        if (dto.complemento().isEmpty()){
            this.complemento = complemento;
        }else {
            this.complemento = dto.complemento();
        }
        this.estado = dto.estado();
    }

    @Override
    public String toString() {
        return "CEP: " + cep + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Complemento: " + complemento + "\n" +
                "Estado: " + estado + "\n" +
                "Bairro: " + bairro + "\n" +
                "Unidade: " + unidade + "\n" +
                "Localidade: " + localidade + "\n" +
                "Região: " + regiao;
    }
}
