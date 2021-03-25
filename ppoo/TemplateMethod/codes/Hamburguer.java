public class Hamburguer extends Ingredientes {
    
    public Hamburguer(Sanduiche sanduiche) {
        super(sanduiche);
    }
    
    @Override
    public double getPreco() {
        return 4.0 + getSanduiche().getPreco();
    }
}