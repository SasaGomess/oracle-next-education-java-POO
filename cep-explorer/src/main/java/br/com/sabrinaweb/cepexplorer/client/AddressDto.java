package br.com.sabrinaweb.cepexplorer.client;


public record AddressDto(String cep, String logradouro, String complemento, String estado, String bairro, String localidade, String regiao) {
}
