import java.io.*;

public class ManipuladoraArquivos {

    public ManipuladoraArquivos() {

    }

    public HistoricoCompras carregarDadosTxt(String arquivoTxt) {

        HistoricoCompras hc = new HistoricoCompras();

        try (BufferedReader arq = new BufferedReader(new FileReader("dadosTexto.txt"))) {

            String linha = arq.readLine();

            while (linha != null) {

                String[] campos = linha.split(",");

                Compras compra = new Compras(campos[0], campos[1], campos[2], Double.parseDouble(campos[3]));

                hc.comprei(compra);

                linha = arq.readLine();
            }
        }

        catch (FileNotFoundException e) {

            System.out.println("Impossivel abrir o arquivo" + " " + arquivoTxt);
        }

        catch (IOException e) {

            System.out.println("Problema na leitura do arquivo" + " " + arquivoTxt);
        }

        return hc;
    }

    public HistoricoCompras carregarDadosBin(String arquivoBin) {

        // Compras compra = null;

        HistoricoCompras hc = new HistoricoCompras();

        try (ObjectInputStream object = new ObjectInputStream(new FileInputStream(arquivoBin))) {

            hc = (HistoricoCompras) object.readObject();
        }

        catch (Exception e) {
            
            System.out.println("É necessario criar o arquivo binario antes de lê-lo, aperte 5");
        }

        return hc;
    }

    public void salvarDadosBin(HistoricoCompras compras, String arquivoDestino) {

        try(ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream(arquivoDestino + ".bin"))) {

            object.writeObject(compras);
        }

        catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
