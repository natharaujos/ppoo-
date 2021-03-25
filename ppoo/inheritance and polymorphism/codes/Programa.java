import java.util.Scanner;

public class Programa {

    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes, ano, numParcelas;
        String horario, cnpj, cpf, formaPagamento;
        double valor;

        Extrato extrato = new Extrato();
            
        System.out.print("Digite o dia : ");
        dia = entrada.nextInt();
        System.out.print("Digite o mes : ");
        mes = entrada.nextInt();
        System.out.print("Digite o ano : ");
        ano = entrada.nextInt();
        System.out.print("Digite o horario : ");    
        horario = entrada.next();
        System.out.print("Digite o valor : ");
        valor = entrada.nextDouble();

        MovimentacaoFinanceira movimentacao = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        extrato.inserir(movimentacao);

        System.out.print("Informe o cnpj: ");
        cnpj = entrada.next();
        System.out.print("Informe o numero de parcelas: ");
        numParcelas = entrada.nextInt();
                    
        Despesa despesa = new Despesa(dia, mes, ano, horario, valor, cnpj, numParcelas);
                    
        System.out.println(despesa);

        System.out.print("Digite o dia : ");
        dia = entrada.nextInt();
        System.out.print("Digite o mes : ");
        mes = entrada.nextInt();
        System.out.print("Digite o ano : ");
        ano = entrada.nextInt();
        System.out.print("Digite o horario : ");    
        horario = entrada.next();
        System.out.print("Digite o valor : ");
        valor = entrada.nextDouble();

        MovimentacaoFinanceira movimentacaoDOIS = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        extrato.inserir(movimentacaoDOIS);

        System.out.print("Informe o cnpj: ");
        cnpj = entrada.next();
        System.out.print("Informe o numero de parcelas: ");
        numParcelas = entrada.nextInt();
                    
        Despesa despesaDOIS = new Despesa(dia, mes, ano, horario, valor, cnpj, numParcelas);
                    
        System.out.println(despesaDOIS);

        System.out.print("Digite o dia : ");
        dia = entrada.nextInt();
        System.out.print("Digite o mes : ");
        mes = entrada.nextInt();
        System.out.print("Digite o ano : ");
        ano = entrada.nextInt();
        System.out.print("Digite o horario : ");    
        horario = entrada.next();
        System.out.print("Digite o valor : ");
        valor = entrada.nextDouble();

        MovimentacaoFinanceira movimentacaoTRES = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        extrato.inserir(movimentacaoTRES);
        
        System.out.print("Informe o cpf: ");
        cpf = entrada.next();
        System.out.print("Informe a forma de pagamento: ");
        formaPagamento = entrada.next();

        Receita receita = new Receita(dia, mes, ano, horario, valor, cpf, formaPagamento);

        System.out.println(receita);

        System.out.print("Digite o dia : ");
        dia = entrada.nextInt();
        System.out.print("Digite o mes : ");
        mes = entrada.nextInt();
        System.out.print("Digite o ano : ");
        ano = entrada.nextInt();
        System.out.print("Digite o horario : ");    
        horario = entrada.next();
        System.out.print("Digite o valor : ");
        valor = entrada.nextDouble();

        MovimentacaoFinanceira movimentacaoQUATRO = new MovimentacaoFinanceira(dia, mes, ano, horario, valor);
        extrato.inserir(movimentacaoQUATRO);
        
        System.out.print("Informe o cpf: ");
        cpf = entrada.next();
        System.out.print("Informe a forma de pagamento: ");
        formaPagamento = entrada.next();

        Receita receitaDOIS = new Receita(dia, mes, ano, horario, valor, cpf, formaPagamento);

        System.out.println(receitaDOIS);
    }
}
