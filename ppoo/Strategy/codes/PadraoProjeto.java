public class PadraoProjeto {
    
    private TipoDeCarro tipoDeCarro;

    public PadraoProjeto(TipoDeCarro tipoDeCarro) {

        this.tipoDeCarro = tipoDeCarro;
    }

    public double calculaNotinha(double valorDiaria, int numeroDias) {

        return tipoDeCarro.calculaNota(valorDiaria, numeroDias);
    }
}
