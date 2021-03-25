public class Tomate extends Ingredientes {
    
    public Tomate(Sanduiche sanduiche) {
        super(sanduiche);
    }
    
    @Override
    public double getPreco() {
        return 0.5 + getSanduiche().getPreco();
    }
}