package com.personal.pokedex2024.controller;

import com.personal.pokedex2024.Model.PokemonBasicInfo;
import com.personal.pokedex2024.Model.PokemonDetails;
import com.personal.pokedex2024.service.PokeApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/pokemon")
@Tag(name = "Pokemon API", description = "API para obtener información de Pokémon")
public class PokemonController {

    @Autowired
    private PokeApiService pokeApiService;


    @Operation(summary = "Obtener información básica de un Pokémon")
    @GetMapping("/{name}")
    public ResponseEntity<PokemonBasicInfo> getPokemonBasicInfo(@PathVariable String name) {
        return ResponseEntity.ok(pokeApiService.getPokemonBasicInfo(name));
    }

    @Operation(summary = "Obtener detalles de un Pokémon")
    @GetMapping("/{name}/details")
    public ResponseEntity<PokemonDetails> getPokemonDetails(@PathVariable String name) {
        return ResponseEntity.ok(pokeApiService.getPokemonDetails(name));
    }
}
