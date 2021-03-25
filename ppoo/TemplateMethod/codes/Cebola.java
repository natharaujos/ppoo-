public class Cebola extends Ingredientes {
    
    public Cebola(Sanduiche sanduiche) {
        super(sanduiche);
    }
    
    @Override
    public double getPreco() {
        return 1.3 + getSanduiche().getPreco();
    }
}