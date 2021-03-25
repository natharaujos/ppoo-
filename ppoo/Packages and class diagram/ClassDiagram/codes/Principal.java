import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorInicial, taxaSelic, taxaR, taxaCdi, vInicio, vFinal, result;
        int tempoAplication;

        System.out.println("###### SIMULACAO ######");
        System.out.print("Entre com o valor a ser investido: ");
        valorInicial = entrada.nextDouble();
        System.out.print("Entre com a duração da aplicação em meses: ");
        tempoAplication = entrada.nextInt();
        
        Investimento Investidor = new Investimento(valorInicial, tempoAplication);
        
        System.out.println("1 - Investimento em poupança");
        System.out.print("Entre com o valor da taxa Selic em %: ");
        taxaSelic = entrada.nextDouble();
        System.out.print("Entre com o valor da taxa referencial (TR) em %: ");
        taxaR = entrada.nextDouble();
        
        Poupanca Poupan = new Poupanca(valorInicial, tempoAplication, taxaSelic, taxaR);
        
        System.out.printf("Valor final para investimento em poupanca: %.2f%n", Poupan.calculaRendimento());
        System.out.println("2 - Investimento em CDB");
        System.out.print("Entre com o valor da taxa CDI em %: ");
        taxaCdi = entrada.nextDouble();
        
        Cdb CDB = new Cdb(valorInicial, tempoAplication, taxaCdi);
        
        System.out.printf("Valor final para investimento em CDB: %.2f%n", CDB.calculaRendimentoCdb());
        System.out.println("3 - Investimento em acao");
        System.out.print("Entre com o preco inicial da acao: ");
        vInicio = entrada.nextDouble();
        System.out.print("Entre com o preco final da acao: ");
        vFinal = entrada.nextDouble();

        Acao action = new Acao(valorInicial, tempoAplication, vInicio, vFinal);

        System.out.printf("Valor final para investimento em acao: %.2f", action.calculaRendimentoAcao());
    }
}
