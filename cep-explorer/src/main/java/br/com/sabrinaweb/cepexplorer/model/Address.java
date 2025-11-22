package br.com.sabrinaweb.cepexplorer.model;


public record Address(String cep, String logradouro,String complemento,String estado, String bairro, Integer unidade, String localidade, String regiao) {
}
