package com.api.pokeapi.RestController.Pokemons;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Pokemons {

    @GetMapping("/pokemons")
    public String pokemons(){
        return "pokemons";

    }



}
