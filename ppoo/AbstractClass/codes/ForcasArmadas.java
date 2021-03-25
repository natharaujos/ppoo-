public class ForcasArmadas extends Beneficiario {
    
    private double ultimoSalario;

    public ForcasArmadas(String cpf, String nome, double ultimoSalario) {

        super(cpf, nome);
        this.ultimoSalario = ultimoSalario;
    }

    public double getUltimoSalario() {

        return ultimoSalario;
    }

    public double contribuicao() {

        return ultimoSalario * (0.11);
    }

    @Override
    public double calculaAposentadoria() {

        return ultimoSalario*(0.9);
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "\n" +
                "Cpf: " + getCpf()  + "\n" +
                "Aposentadoria: " + String.format("%.2f", calculaAposentadoria()) + "\n" +
                "Contribuicao: " + String.format("%.2f", contribuicao());
    }
}
