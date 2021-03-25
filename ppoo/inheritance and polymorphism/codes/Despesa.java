public class Despesa extends MovimentacaoFinanceira{
    
    private String cnpj;
    private int numParcelas;

    public Despesa(int dia, int mes, int ano, String horario, double valor, String cnpj, int numParcelas) {
        
        super(dia, mes, ano, horario, valor);
        this.cnpj = cnpj;
        this.numParcelas = numParcelas;
    }

    public String getCnpj() {

        return cnpj;
    }

    public int getNumParcelas() {

        return numParcelas;
    }

    public double calculaImposto() {

        double imposto;
        imposto = getTaxa() + (0.01 * getValor() * numParcelas);
        return imposto;
    }

    @Override
    public String toString(){
        return "despesa realizada em: " + getDia() + "/" + getMes() + "/" + getAno() +  " " + getHorario() + "\n"
        + "Valor: " + getValor() + "\n" + "CNPJ: " + getCnpj() + "\n" + "Numero de parcelas: " + getNumParcelas()  + "\n"
        + "Imposto a pagar: " + calculaImposto();
     }
}
