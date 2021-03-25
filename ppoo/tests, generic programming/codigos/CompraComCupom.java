public class CompraComCupom extends Compra {
    
    private double valorCumpom;

    public CompraComCupom(String nomeProduto, int quantidadeComprada, double precoUnitario, int valorCumpom) {
    
        super(nomeProduto, quantidadeComprada, precoUnitario);
        this.valorCumpom = valorCumpom;
    }

    public double calculaDesconto() {

        double calcula = ((getQuantidade() * getPreco()) - valorCumpom);

        if (calcula >= 0) {

            return calcula;
        }

        else {

            return 0;
        }
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
