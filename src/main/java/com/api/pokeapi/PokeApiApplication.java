package com.api.pokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class PokeApiApplication {

	@RequestMapping ("/pokeapi")
	public String pokeapi() {
		return "pokeapi";
	}

	@GetMapping (value = "/pokeapi")
	private String getpokeapi(){
		String uri = "https://pokeapi.co/api/v2/pokemon/";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}


	public static void main(String[] args) {
		SpringApplication.run(PokeApiApplication.class, args);
	}

}
