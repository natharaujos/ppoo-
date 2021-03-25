public class Queijo extends Ingredientes {
    
    public Queijo(Sanduiche sanduiche) {
        super(sanduiche);
    }
    
    @Override
    public double getPreco() {
        return 2.3 + getSanduiche().getPreco();
    }
}