import java.util.ArrayList;

public class Cafe {

    private String tipoCafe;
    private ArrayList<Integer>complementos;

    public Cafe(String tipoCafe) {

        this.tipoCafe = tipoCafe;
        complementos = new ArrayList<Integer>();
    }

    public String getCafe() {
        
        return tipoCafe;
    }

    public int getComplementos() {

        return complementos.size();
    }

    public int getArraylist(int posicao) {

        return complementos.get(posicao);
    }

    public void inserirArraylist(int adicionar) {

        complementos.add(adicionar);
    }
}
