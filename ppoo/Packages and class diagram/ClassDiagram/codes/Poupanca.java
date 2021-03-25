public class Poupanca extends Investimento {

    private double taxaSelic;
    private double taxaReferencial;

    public Poupanca(double valorInvestimento, int tempoAplicacao, double taxaSelic, double taxaReferencial) {
        
        super(valorInvestimento, tempoAplicacao);
        this.taxaSelic = taxaSelic;
        this.taxaReferencial = taxaReferencial;
    }

    public double calculaRendimento() {

        double rendimento;
        double valorFinal;
        rendimento = ((0.7 * taxaSelic) + taxaReferencial);
        valorFinal = getValor()*Math.pow((1+rendimento/100), getMes());
        return valorFinal;
    }
}
