import java.io.Serializable;

public class Compras implements Comparable<Compras>, Serializable {

    private String cpf;
    private String nome;
    private double preco;
    private String date;
    private static final long serialVersionUID = 1L;

    public Compras(String cpf, String date, String nome, double preco) {

        this.cpf = cpf;
        this.nome = nome;
        this.preco = preco;
        this.date = date;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {

        return nome;
    }

    public double getPreco() {

        return preco;
    }

    public String getDate() {

        return date;
    }

    public String toString() {

        return getDate() + "," + getNome() + "," + getPreco() + "\n";
    }

    public int compareTo(Compras comparar) {

        if (this.getPreco() > comparar.getPreco()) {

            return 1;
        }

        else if (this.getPreco() < comparar.getPreco()) {

            return -1;
        }

        return 0;
    }
}
