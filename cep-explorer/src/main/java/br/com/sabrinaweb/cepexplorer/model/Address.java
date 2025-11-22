package br.com.sabrinaweb.cepexplorer.model;

import br.com.sabrinaweb.cepexplorer.client.AddressDto;

public class Address {
    private String cep;
    private String logradouro;
    private String complemento;
    private String estado;
    private String bairro;
    private Integer unidade;
    private String localidade;
    private String regiao;

    public Address(AddressDto dto, Integer unidade, String complemento){
        this.bairro = dto.bairro();
        this.cep = dto.cep();
        this.regiao = dto.regiao();
        this.unidade = unidade;
        this.localidade = dto.localidade();
        this.logradouro = dto.logradouro();
        this.complemento = complemento;
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
