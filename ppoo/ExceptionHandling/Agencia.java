import java.util.ArrayList;

public class Agencia {
    
    private String numero;
    private String nome;
    private ArrayList<Conta> contas;

    public Agencia (String numero, String nome) {

        this.numero = numero;
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void criarConta() {

        contas.add(new Conta(contas.size()+ 1));
    }

    public String getRelatorio() {

        String res = "Lista de Contas Bancarias: ";

        if (contas.size() > 0) {

            for (Conta c : contas) {

                res += "\n\nNumero: " + c.getNumero() + "\nSaldo: " + c.getSaldo();
            }
        }

        else {

            res += "\nNao ha contas cadastradas nessas Agencia";
        }

        return res;
    }

    public boolean depositar(int numeroConta, double valor) {

        Conta contaDestino = getConta(numeroConta);

        if (contaDestino != null) {

            contaDestino.depositar(valor);
            return true;
        }

        else{

            throw new RuntimeException("Conta Inexistente");
        }
    }

    public boolean sacar(int numeroConta, double valor) {

        Conta contaDestino = getConta(numeroConta);

        if (contaDestino != null) {

            contaDestino.sacar(valor);
            return true;
        }

        else {

            throw new RuntimeException("Conta Inexistente");
        }
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {

        Conta contaDestino = getConta(numeroContaDestino);
        Conta contaOrigem = getConta(numeroContaOrigem);

        if (contaOrigem != null) {
            
            if (contaDestino != null) {

                contaOrigem.transferir(contaDestino, valor);
            }

            else {

                throw new RuntimeException("Conta de Destino Inexistente");
            }
        }

        else {

            throw new RuntimeException("Conta de Origem Inexistente");
        }
    }

    public Conta getConta(int numeroConta) {

        for (Conta c : contas) {

            if (c.getNumero() == numeroConta) {

                return c;
            }
        }

        return null;
    }
}
