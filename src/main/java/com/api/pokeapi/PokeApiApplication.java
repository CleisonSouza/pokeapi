package com.api.pokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PokeApiApplication {
	public static void main(String[] args) {
        SpringApplication.run(PokeApiApplication.class, args);
    }
}
