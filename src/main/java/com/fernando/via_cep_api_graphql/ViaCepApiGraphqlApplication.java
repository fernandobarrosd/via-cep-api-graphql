package com.fernando.via_cep_api_graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableFeignClients
public class ViaCepApiGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApiGraphqlApplication.class, args);
	}

}
