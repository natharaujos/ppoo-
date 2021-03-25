public class Acao extends Investimento{

    private double precoInicio;
    private double precoFim;

    public Acao(double valorInvestimento, int tempoAplicacao, double precoInicio, double precoFim) {

        super(valorInvestimento, tempoAplicacao);
        this.precoInicio = precoInicio;
        this.precoFim = precoFim;
    }

    public double calculaRendimentoAcao() {

        double rendimentoAcao;
        double valorFinal;
        rendimentoAcao = (precoFim/precoInicio) * 100 - 100;
        valorFinal = getValor()*Math.pow((1+rendimentoAcao/100), getMes());
        return valorFinal;
    }  
}
