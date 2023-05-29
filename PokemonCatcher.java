import java.util.Random;

public class PokemonCatcher {
    private Pokemon[] pokemonList;
    private Random random;

    public PokemonCatcher(Pokemon[] pokemonList) {
        this.pokemonList = pokemonList;
        this.random = new Random();
    }

    public Pokemon catchPokemon() {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getName().equals("파이리")) {
                return pokemon;
            }
        }
        return null; // 파이리를 못 잡은 경우
    }
}