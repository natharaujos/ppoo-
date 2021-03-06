public abstract class Beneficiario {
    
    private String cpf;
    private String nome;

    public Beneficiario(String cpf, String nome) {

        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public String getNome() {

        return nome;
    }

    public abstract double calculaAposentadoria();
}
