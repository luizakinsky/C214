import java.beans.Transient;
import org.junit.Test;

public class BuscaPokemonTeste {

    PokemonService service;

    // Contexto do teste usado para todos
    @Before
    public void setup(){
        service = new MockPokemonService();
        BuscaPokemon buscaPokemon = new BuscaPokemon(service); //injetando dependencias com o mock
    }

    @Test
    public void testeBuscaPokemonCaterpie(){

        Pokemon caterpie = buscaPokemon.buscaPokemon(10);

        // assertEquals(expected, )
        assertEquals("Caterpie", buscaPokemon.getNome());
        assertEquals(30.0, buscaPokemon.getVida(), 0.1);
        assertEquals("Inseto", buscaPokemon.getArma());
    }

    @Test
    public void testeBuscaPokemonRaticate(){

        Pokemon raticate = buscaPokemon.buscaPokemon(20);

        // assertEquals(expected, )
        assertEquals("Raticate", buscaPokemon.getNome());
        assertEquals(40.0, buscaPokemon.getVida(), 0.1);
        assertEquals("Rato", buscaPokemon.getArma());
    }
}
