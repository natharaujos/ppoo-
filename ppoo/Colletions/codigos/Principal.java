import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Cafe cafezinho = null;

        int numCafe;

        System.out.printf("Digite o codigo do tipo do cafe (0: Americano/1: Expresso/2: Sem Cafeina): ");

        numCafe = entrada.nextInt();

        if(numCafe == 0) {

            cafezinho = new Cafe("Americano");
        }

        else if(numCafe == 1) {

            cafezinho = new Cafe("Expresso");
        }

        else if(numCafe == 2) {

            cafezinho = new Cafe("Sem Cafeina");
        }

        float precoCafe[] = {7.50f, 4.30f, 10.00f};
        float precoComplementos[] = {5.00f, 8.00f, 2.00f};

        int option;
        int cont = 1;

        System.out.printf("Deseja adicionar algum complemento? (0: não ou 1: sim): ");
        option = entrada.nextInt();
        
        while(option!=0) {
            
            int tipoComplemento;
            System.out.printf("Insira o codigo do %d ° complemento desejado (0: leite, 1: chocolate, 2: canela) : ", cont);
            tipoComplemento = entrada.nextInt();

            if(tipoComplemento == 0) {

                cafezinho.inserirArraylist(tipoComplemento);
            }

            else if(tipoComplemento == 1) {

                cafezinho.inserirArraylist(tipoComplemento);
            }

            else if(tipoComplemento == 2) {

                cafezinho.inserirArraylist(tipoComplemento);
            }

            System.out.printf("Deseja adicionar algum complemento? (0: não ou 1: sim): ");
            option = entrada.nextInt();
            cont++;
        }
        
        System.out.println("############### NOTA FISCAL ###############");
        System.out.printf("Cafe: %s %n", cafezinho.getCafe());

        if(numCafe == 0) {

            System.out.printf("Preco do Cafe: %.2f %n", precoCafe[0]);
        }

         if(numCafe == 1) {

            System.out.printf("Preco do Cafe: %.2f %n", precoCafe[1]);
        }

        if(numCafe == 2) {

            System.out.printf("Preco do Cafe: %.2f %n", precoCafe[2]);
        }

        float preco = 0;

        for (int i = 0; i < cafezinho.getComplementos(); i++) {

            if(cafezinho.getArraylist(i) == 0) {

                preco += precoComplementos[0];
            }

            else if(cafezinho.getArraylist(i) == 1) {

                preco += precoComplementos[1];
            }

            else if(cafezinho.getArraylist(i) == 2) {

                preco += precoComplementos[2];
            }
            
        }
        
        System.out.printf("Preco dos Complementos: %.2f %n", preco);

        float total = 0;

        total = preco + precoCafe[numCafe];

        System.out.printf("Total: %.2f", total);
    
    }
}