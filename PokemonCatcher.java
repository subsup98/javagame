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
            if (pokemon.getName().equals("���̸�")) {
                return pokemon;
            }
        }
        return null; // ���̸��� �� ���� ���
    }
}