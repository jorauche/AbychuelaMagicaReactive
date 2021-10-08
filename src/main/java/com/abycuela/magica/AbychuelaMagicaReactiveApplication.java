package com.abycuela.magica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
public class AbychuelaMagicaReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbychuelaMagicaReactiveApplication.class, args);
	}

}
