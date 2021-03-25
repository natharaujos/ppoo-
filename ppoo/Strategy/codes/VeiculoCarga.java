public class VeiculoCarga implements TipoDeCarro {
    
    private int tipoDeCarga;

    public VeiculoCarga(int tipoDeCarga) {

        this.tipoDeCarga = tipoDeCarga;
    }

    @Override
    public double calculaNota(double valorDiaria, int numeroDias) {

        if (tipoDeCarga == 1) {

            return valorDiaria*numeroDias;
        }

        else {

            return 1.5*valorDiaria*numeroDias;
        }
    }
}
