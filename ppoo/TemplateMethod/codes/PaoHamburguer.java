public class PaoHamburguer extends Sanduiche {
    public PaoHamburguer(String nome) {
        setNome(nome);
    }
    
    @Override
    public double getPreco() {
        return 2.50;
    }
}