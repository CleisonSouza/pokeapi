package com.api.pokeapi.RestController.Pokemons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Pokemon {


    @GetMapping (value = "/pokemons")
    private String getpokeapi(){
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @GetMapping ( value = "/pokemons/{id}")
    public String getUmPokemon (@PathVariable String id){
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        String  urlCompleta = uri.concat(id);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(urlCompleta, String.class);

        return result;
    }


}
