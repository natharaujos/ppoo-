public class Cdb extends Investimento {

    private double taxaCDI;
    
    public Cdb(double valorInvestimento, int tempoAplicacao, double taxaCDI) {
        
        super(valorInvestimento, tempoAplicacao);
        this.taxaCDI = taxaCDI;
    }

    public double calculaRendimentoCdb() {

        double rendimentoCdb;
        double valorFinal;
        rendimentoCdb = (1.2 * taxaCDI);
        valorFinal = getValor()*Math.pow((1+rendimentoCdb/100), getMes());
        return valorFinal;
    }
}
