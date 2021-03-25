import java.util.ArrayList;

public class Extrato {
    
    private ArrayList<MovimentacaoFinanceira> move;

    public Extrato() {

        move = new ArrayList<MovimentacaoFinanceira>();
    }

    public void inserir(MovimentacaoFinanceira movimentation) {

        move.add(movimentation);
    }
}
