import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class HistoricoCompras implements Serializable {
    
    private ArrayList<Compras> listaCompras;
    private static final long serialVersionUID = 1L;

    public HistoricoCompras() {

        listaCompras = new ArrayList<Compras>();
    }

    public void gerarRelatorio(String cpf) {
        
        Collections.sort(listaCompras);

        for (Compras compras : listaCompras) {

            if (compras.getCpf().equals(cpf)) {
            
                System.out.println(compras);
            }
        }
    }

    public void salvarDadosTxt(String dadosTexto) {

        try (FileWriter arq = new FileWriter(dadosTexto + ".txt")) {

            for (Compras compra : listaCompras) {

                if (compra.getCpf().equals(dadosTexto)) {
                    
                    arq.write(compra.toString());
                }   
            }
        }

        catch(Exception e) {

            System.out.println("Falha ao salvar no Arquivo" + " " + dadosTexto);
        }
    }

    public void comprei(Compras compra) {

        listaCompras.add(compra);
    }
}
