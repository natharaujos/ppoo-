import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int option;
        ManipuladoraArquivos Manipular = new ManipuladoraArquivos();
        HistoricoCompras Hc = new HistoricoCompras();
        //HistoricoCompras Hc2 = new HistoricoCompras();
        String cepefe;
        boolean verifica1 = false;

        do{
            menu();
            option = entrada.nextInt();
            
            switch(option) {

                 case 1:
                    Hc = Manipular.carregarDadosTxt("dadosTexto.txt");
                    verifica1 = true;
                    break;
                 case 2:
                    Hc = Manipular.carregarDadosBin("dadosBin.bin");
                    break;
                case 3:
                    if(verifica1) {

                        System.out.println("Digite o Cpf: ");
                        cepefe = entrada.next();
                        Hc.gerarRelatorio(cepefe);
                    }

                    else {

                        System.out.println("É necessario ler o arquivo antes de gerar o relatorio!\nDigite (1)");
                    }
                    break;
                case 4:
                    if(verifica1) {
                        
                        System.out.println("Digite o Cpf: ");
                        cepefe = entrada.next();
                        Hc.salvarDadosTxt(cepefe);
                    }

                    else {

                        System.out.println("É necessario ler o arquivo antes de salvar o relatorio em outro arquivo.txt!\nDigite (1)");
                    }
                    break;
                case 5:
                    if(verifica1) {
                        
                        Manipular.salvarDadosBin(Hc, "dadosBin");
                    }

                    else {

                        System.out.println("Antes disso, leia o arquivo digitando 1");
                    }
                    break;
                case 6: // sair
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while (option != 6);

        entrada.close();
    }

    public static void menu() {

        System.out.println("=======================Menu======================");
        System.out.println("1---------Carregar dados de arquivo texto--------");
        System.out.println("2--------Carregar dados de arquivo binário-------");
        System.out.println("3-------------Gerar relatorio na tela------------");
        System.out.println("4-------Salvar relatorio em arquivo de texto-----");
        System.out.println("5-Gerar arquivo binario a partir do arquivo texto");
        System.out.println("6----------------------Sair----------------------");
    }
}
