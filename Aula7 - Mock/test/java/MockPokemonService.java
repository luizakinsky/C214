public class MockPokemonService implements PokemonService{
    @Override
    public String busca(int id){
        // imitação do real

        if(id == 10){
            return PokemonConst.CATERPIE;
        }else if(id == 20){
            return PokemonConst.RATICATE;
        }else if(id == 30){
            return PokemonConst.PIKACHU;
        }else{
            return null;
        }
    }
}