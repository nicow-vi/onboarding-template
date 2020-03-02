package com.virtualidentity.backendonboarding.pokemons.rest;

import com.virtualidentity.backendonboarding.common.rest.controller.BaseController;
import com.virtualidentity.backendonboarding.generated.AuthorsApi;
import com.virtualidentity.backendonboarding.generated.PokemonsApi;
import com.virtualidentity.backendonboarding.generated.model.AuthorList;
import com.virtualidentity.backendonboarding.generated.model.InlineResponse200;
import com.virtualidentity.backendonboarding.generated.model.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class PokemonController extends BaseController implements PokemonsApi {
    @Override
    public ResponseEntity<List<Pokemon>> getPokemons() throws Exception {
        Pokemon pokemon1 = new Pokemon().name("Pikachu");
        Pokemon pokemon2 = new Pokemon().name("Bisasam");
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        return new ResponseEntity<>(pokemonList,HttpStatus.OK);
    }
}
