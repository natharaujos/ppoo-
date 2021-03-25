public class CompraNormal extends Compra {

    private int percentualDesconto;

    public CompraNormal(String nomeProduto, int quantidadeComprada, double precoUnitario, int percentualDesconto) {
    
        super(nomeProduto, quantidadeComprada, precoUnitario);
        this.percentualDesconto = percentualDesconto;
    }

    public double calculaDesconto() {

        double calcula = ((percentualDesconto * getPreco())/100) * getQuantidade();
        return (getPreco() * getQuantidade()) - calcula;
    }

    @Override
    public String toString() {

        return getNomeProduto() + "\t" + getQuantidade() + "\t" + getPreco() + "\t\t" + calculaDesconto();
    }

    @Override
    public int compareTo(Compra c) {

        if (this.getPreco() > c.getPreco()) {

            return 1;
        }

        else if (this.getPreco() < c.getPreco()){

            return -1;
        }

        return 0;
    }
}
