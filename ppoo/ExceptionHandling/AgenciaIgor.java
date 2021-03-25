import java.util.ArrayList;

public class AgenciaIgor {
    
    private String numero;
    private String nome;
    private ArrayList<ContaIgor> contas;

    public AgenciaIgor (String numero, String nome) {

        this.numero = numero;
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void criarConta() {

        contas.add(new ContaIgor(contas.size()+ 1));
    }

    public String getRelatorio() {

        String res = "Lista de Contas Bancarias: ";

        if (contas.size() > 0) {

            for (ContaIgor c : contas) {

                res += "\n\nNumero: " + c.getNumero() + "\nSaldo: " + c.getSaldo();
            }
        }

        else {

            res += "\nNao ha contas cadastradas nessas Agencia";
        }

        return res;
    }

    public boolean depositar(int numeroConta, double valor) {

        ContaIgor contaDestino = getConta(numeroConta);

        if (contaDestino != null) {

            contaDestino.depositar(valor);
            return true;
        }

        else{

            throw new RuntimeException("Conta Inexistente");
        }
    }

    public boolean sacar(int numeroConta, double valor) {

        ContaIgor contaDestino = getConta(numeroConta);

        if (contaDestino != null) {

            contaDestino.sacar(valor);
            return true;
        }

        else {

            throw new RuntimeException("Conta Inexistente");
        }
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {

        ContaIgor contaDestino = getConta(numeroContaDestino);
        ContaIgor contaOrigem = getConta(numeroContaOrigem);

        if ((contaOrigem != null) && (contaDestino != null)) {

            contaOrigem.transferir(contaDestino, valor);
         }

        else {

            throw new RuntimeException("Conta de Origem Inexistente");
        }
    }

    public ContaIgor getConta(int numeroConta) {

        for (ContaIgor c : contas) {

            if (c.getNumero() == numeroConta) {

                return c;
            }
        }

        return null;
    }
}
