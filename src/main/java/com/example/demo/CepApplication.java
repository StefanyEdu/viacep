package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CepApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner cep(CepRepository repository) {
		return (args)-> {
			repository.save(new Cep("90250554" ,"Paulo Renato Ketzer de Souza ","Porto Alegre", "Rio Grande do Sul "));
            repository.save(new Cep("90620001","Princesa Isabel","Porto Alegre","Rio Grande do sul"));
            
		};
	}

}
