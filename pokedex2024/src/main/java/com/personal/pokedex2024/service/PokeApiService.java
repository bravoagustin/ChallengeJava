package com.personal.pokedex2024.service;

import com.personal.pokedex2024.Model.PokemonBasicInfo;
import com.personal.pokedex2024.Model.PokemonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PokeApiService {

    @Autowired
    private RestTemplate restTemplate;

    public PokemonBasicInfo getPokemonBasicInfo(String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        return restTemplate.getForObject(url, PokemonBasicInfo.class);
    }

    public PokemonDetails getPokemonDetails(String name) {
        String url = "https://pokeapi.co/api/v2/pokemon-species/" + name;
        return restTemplate.getForObject(url, PokemonDetails.class);
    }

    public List<PokemonBasicInfo> getAllPokemons() {
        String url = "https://pokeapi.co/api/v2/pokemon?limit=100"; // Ajusta el límite según tus necesidades
        Map response = restTemplate.getForObject(url, Map.class);
        List<Map> results = (List<Map>) response.get("results");

        List<PokemonBasicInfo> pokemonList = new ArrayList<>();
        for (Map result : results) {
            String pokemonName = (String) result.get("name");
            PokemonBasicInfo pokemon = getPokemonBasicInfo(pokemonName);
            pokemonList.add(pokemon);
        }
        return pokemonList;
    }
}
