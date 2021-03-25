public class VeiculoPasseio implements TipoDeCarro {
    
    @Override
    public double calculaNota(double valorDiaria, int numeroDias) {

        return valorDiaria*numeroDias;
    }
}
