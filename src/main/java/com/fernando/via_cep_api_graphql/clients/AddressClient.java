package com.fernando.via_cep_api_graphql.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fernando.via_cep_api_graphql.models.Address;

@FeignClient(value = "address", url = "http://viacep.com.br/ws")
public interface AddressClient {
    @GetMapping("/{cep}/json/")
    Address findAddressByCep(@PathVariable String cep);
}