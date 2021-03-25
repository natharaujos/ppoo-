public class Receita extends MovimentacaoFinanceira{
    
    private String cpf;
    private String recebimento;

    public Receita(int dia, int mes, int ano, String horario, double valor, String cpf, String recebimento) {
        
        super(dia, mes, ano, horario, valor);
        this.cpf = cpf;
        this.recebimento = recebimento;
    }

    public String getCpf() {

        return cpf;
    }

    public String getRebimento(String recebimento) {

        return recebimento;
    }

    public double calculaImpostoReceita() {

        double imposto = 0.0;

        if (recebimento.equals("Dinheiro")) {

            imposto = (0.015 * getValor()) + getTaxa();
        }

        else if (recebimento.equals("Debito")) {

            imposto = (0.03 * getValor()) + getTaxa();
        }

        else if (recebimento.equals("Credito")) {

            imposto = (0.04 * getValor()) + getTaxa();
        }

        return imposto;
    } 

    public String toString(){
        return "Receita recebida em: " + getDia() + "/" + getMes() + "/" + getAno() +  " " + getHorario()+ "\n"
        +"Valor : " + getValor()+ "\n" + "CPF : " + getCpf() + "\n" + "Forma de pagamento: " + getRebimento(recebimento) + "\n" +
        "Imposto a pagar: " + calculaImpostoReceita();
     }
}
