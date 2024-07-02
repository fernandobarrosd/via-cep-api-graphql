package com.fernando.via_cep_api_graphql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.fernando.via_cep_api_graphql.clients.AddressClient;
import com.fernando.via_cep_api_graphql.models.Address;

@Controller
public class AddressController {
    @Autowired
    private AddressClient addressClient;

    @QueryMapping
    public Address findAddressInfo(@Argument String cep) {
        return addressClient.findAddressByCep(cep);
    }
}