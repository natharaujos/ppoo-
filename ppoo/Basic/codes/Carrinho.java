
public class Carrinho{
    private String cliente;
    private String[] carrinho;
    private int dia;
    private int mes;
    private int ano;
    private int contadorItens;

    public Carrinho(String cliente, int dia, int mes, int ano){
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[5];
        contadorItens = 0;
    }

    public Carrinho(String cliente, int dia, int mes, int ano, int qtd){
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.qtd = qtd;
        carrinho = new String[qtd];
        contadorItens = 0;
    }

    public String getCliente(){
        return cliente;
    }

    public void exibir(){

        System.out.printf("Data da compra: %d/%d/%d %n", dia, mes, ano);

        System.out.printf("Itens do Carrinho: ");

        for(int i = 0; i < carrinho.length; i++){
            
            System.out.printf(carrinho[i]);
            System.out.printf(" ");
        }
    }

    public void inserirItem(String produto){
        carrinho[contadorItens] = produto;
        contadorItens++;
    }
}