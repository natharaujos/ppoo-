public class ServicoPublico extends Beneficiario{
    
    private double mediaSalarial;

    public ServicoPublico(String cpf, String nome, double mediaSalarial) {

        super(cpf, nome);
        this.mediaSalarial = mediaSalarial;
    }

    public double getMediaSalarial() {

        return mediaSalarial;
    }

    public double contribuicao() {

        return mediaSalarial * (0.14);
    }

    @Override
    public double calculaAposentadoria() {

        return mediaSalarial*(0.8);
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "\n" +
                "Cpf: " + getCpf()  + "\n" +
                "Aposentadoria: " + String.format("%.2f", calculaAposentadoria()) + "\n" +
                "Contribuicao: " + String.format("%.2f", contribuicao());
    }
}
