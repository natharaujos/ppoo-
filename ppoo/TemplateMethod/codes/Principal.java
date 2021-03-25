public class Principal {

    public static void main(String[] args) {
        Sanduiche sanduiche = new PaoHamburguer("X-Burguer");
        sanduiche = new Hamburguer(sanduiche);
        sanduiche = new Queijo(sanduiche);
        sanduiche = new Queijo(sanduiche);
        gerarNotinha(sanduiche);
    }
    
    public static void gerarNotinha(Sanduiche sanduiche) {
        System.out.println("Nome: " + sanduiche.getNome());
        System.out.printf("Preço: %.2f", sanduiche.getPreco());
    }
}