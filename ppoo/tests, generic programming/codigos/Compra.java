public abstract class Compra implements Comparable<Compra> {
    
    private String nomeProduto;
    private int quantidadeComprada;
    private double precoUnitario;

    public Compra(String nomeProduto, int quantidadeComprada, double precoUnitario) {

        this.nomeProduto = nomeProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }

    public String getNomeProduto() {

        return nomeProduto;
    }

    public int getQuantidade() {

        return quantidadeComprada;
    }

    public double getPreco() {

        return precoUnitario;   
    }

    public abstract double calculaDesconto();
}
