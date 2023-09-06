package com.example.viacep;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.viacep.models.Endereco;
import com.example.viacep.service.viaCepService;

@SpringBootApplication
public class ViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViacepApplication.class, args);
		
		viaCepService viaCepService = new viaCepService();
		
		try {
			Endereco endereco =  viaCepService.getEndereco("31150080");
			System.out.println(endereco);

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
