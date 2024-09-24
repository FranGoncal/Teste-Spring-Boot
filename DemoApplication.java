package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Define que esta classe é um controlador REST
public class DemoApplication implements ApplicationRunner {

	@Autowired
	@Qualifier("nome.app")  // Corrigido o Qualifier para coincidir com o Bean
	private String nomeaplicacao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("###### Ola Mundo desde o Application Runner! #####");
	}

	// Http GET /ola
	@GetMapping(value = "/ola")
	public String olamundo(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
		return "Olá " + nome + " da app " + nomeaplicacao;
	}

	// Http GET /getconta
	@GetMapping(value = "/getconta")
	public Conta getContabyId(@RequestParam("id") long id) {
		return new Conta(id, "Alexandre", "Castelo Branco", 123456789, 1234, 1000.0);
	}
}
