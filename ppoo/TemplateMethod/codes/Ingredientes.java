public abstract class Ingredientes extends Sanduiche {
    
    private Sanduiche sanduiche;

    public Ingredientes(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
        setNome(sanduiche.getNome());
    }
    
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}
