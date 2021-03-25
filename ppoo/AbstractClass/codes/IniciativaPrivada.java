public class IniciativaPrivada extends Beneficiario {
    
    private int percentualContribuicao;

    public IniciativaPrivada(String cpf, String nome, int percentualContribuicao) {

        super(cpf, nome);
        this.percentualContribuicao = percentualContribuicao;
    }
    public int getPercentual() {

        return percentualContribuicao;
    }

    @Override
    public double calculaAposentadoria() {

        return (percentualContribuicao * (5645.80))/100;
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() + "\n" +
                "Cpf: " + getCpf()  + "\n" +
                "Aposentadoria: " + String.format("%.2f", calculaAposentadoria());
            
    }
}
