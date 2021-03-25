public class Investimento {

    private double valorInvestimento;
    private int tempoAplicacao;

    public Investimento(double valorInvestimento, int tempoAplicacao) {

        this.valorInvestimento = valorInvestimento;
        this.tempoAplicacao = tempoAplicacao;
    }

    public double getValor() {

        return valorInvestimento;
    }

    public double getMes() {

        return tempoAplicacao;
    }
}