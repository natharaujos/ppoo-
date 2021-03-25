
import java.util.Scanner;

public class teste 
{
    public static void main(String[] args)
    {   
        Scanner entrada = new Scanner(System.in);

        int quantidade;
        quantidade = entrada.nextInt();
        
        Carrinho meuCarrinho;
        Carrinho meuCarrinho2;

        String name;


        if (quantidade==5) {
            
            meuCarrinho = new Carrinho("Nathan", 26, 12, 2000);
            
            for(int i = 0; i < quantidade; i++){
                name = entrada.next();
                meuCarrinho.inserirItem(name); 
            }

            System.out.printf("Cliente: %s %n", meuCarrinho.getCliente());
            meuCarrinho.exibir();

        }

        else if(quantidade!=5){

            meuCarrinho2 = new Carrinho("Nathan", 26, 12, 2000, quantidade);

            for(int i = 0; i < quantidade; i++){
                name = entrada.next();
                meuCarrinho2.inserirItem(name);
            }
            
            System.out.printf("Cliente: %s %n", meuCarrinho2.getCliente());
            meuCarrinho2.exibir();
        }
    }

}
