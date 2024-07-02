package com.fernando.via_cep_api_graphql.models;

public record Address(
    String cep,
    String logradouro,
    String complemento,
    String unidade,
    String bairro,
    String localidade,
    String uf,
    String ibge,
    String gia,
    String ddd,
    String siafi) {}