public class BuscaPokemon(PokemonService pokemonService) {
    this.pokemonService = pokemonService;
}

public Pokemon buscaPokemon(int id){
    String pokemonJson = pokemonService.busca(id);

    JsonObject jsonObject = JsonParser.parseString(pokemonJson);

    return new Pokemon(jsonObject.get("nome").getAsString(),
            jsonObject.get("vida").getAsDouble(),
            jsonObject.get("arma").getAsString());
}
