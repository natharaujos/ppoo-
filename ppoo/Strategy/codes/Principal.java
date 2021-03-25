import java.util.Scanner;

public class Principal {

    public static void main(String [] args) {
        
        Scanner entrada = new Scanner(System.in);

        int option;
        double valorDiaria;
        int numeroDias;
        double resposta;
        PadraoProjeto type;

        do{
            menu();
            option = entrada.nextInt();
            
            if (option == 1) {

                System.out.print("Digite com o valor da diaria: ");
                valorDiaria = entrada.nextDouble();
                System.out.print("Digite com a quantidade de dias: ");
                numeroDias = entrada.nextInt();
                type = new PadraoProjeto(new VeiculoPasseio());
                resposta = type.calculaNotinha(valorDiaria, numeroDias);
                gerar(resposta);
            }

            else if (option == 2) {

                int tipoDeCarga;
                System.out.print("Digite o valor da diaria: ");
                valorDiaria = entrada.nextInt();
                System.out.print("Digite a quantidade de dias: ");
                numeroDias = entrada.nextInt();
                System.out.print("Se o seu veiculo for cabine simples, digite 1, se for cabine dupla, digite 2: ");
                tipoDeCarga = entrada.nextInt();
                type = new PadraoProjeto(new VeiculoCarga(tipoDeCarga));
                resposta = type.calculaNotinha(valorDiaria, numeroDias);
                gerar(resposta);
            }

            else if (option == 3) {

                double capacidade;
                System.out.print("Digite o valor da diaria: ");
                valorDiaria = entrada.nextInt();
                System.out.print("Digite a quantidade de dias: ");
                numeroDias = entrada.nextInt();
                System.out.print("Digite a capacidade do veiculo: ");
                capacidade = entrada.nextInt();
                type = new PadraoProjeto(new VeiculoPassageiro(capacidade));
                resposta = type.calculaNotinha(valorDiaria, numeroDias);
                gerar(resposta);
            }

        }while(option!=4);
    }

    public static void menu() {

        System.out.println("#### LOCADORA DE VEICULOS ####");
        System.out.println("1 - Gerar nota para veículo de passeio");
        System.out.println("2 - Gerar nota para veículo de carga");
        System.out.println("3 - Gerar nota para veículo de passageiros");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public static void gerar(double resposta) {

        System.out.println("===================== Nota Fiscal =============================");
        System.out.println();
        System.out.printf("=                 Valor a ser pago:%.2f                            =", resposta);
        System.out.println();
        System.out.println("===============================================================");
    }
}