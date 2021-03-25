public class VeiculoPassageiro implements TipoDeCarro{
    
    private double capacidadeVeiculo;
    
    public VeiculoPassageiro(double capacidadeVeiculo) {

        this.capacidadeVeiculo = capacidadeVeiculo;
    }

    @Override
    public double calculaNota(double valorDiaria, int numeroDias) {

        return ((valorDiaria*numeroDias)*((capacidadeVeiculo/100)+1));
    }
}
