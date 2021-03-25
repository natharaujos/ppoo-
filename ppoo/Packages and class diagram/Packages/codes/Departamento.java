import java.util.ArrayList;

public class Departamento {

    private String sigla;
    private ArrayList<Disciplinas>disciplina;
    Disciplinas disciplinado;

    public Departamento(String sigla) {

        this.sigla = sigla;
        disciplina = new ArrayList<Disciplinas>();
    }

    public void adicionarDisciplina(Disciplinas codigo){

        disciplina.add(codigo);
    }

    private Disciplinas buscarDisciplina(String busca) {

        int disciplinaAux=-1;
        for (int i = 0; i < disciplina.size(); i++) {
            
            if(disciplina.get(i).getCodigo().equals(busca)) {

                disciplinaAux = i;
            }   
        }

        if(disciplinaAux != -1) {

            return disciplina.get(disciplinaAux);
        }

        else {

            return null;
        }
    }

    public void removerDiciplina(String code) {

        disciplina.remove(buscarDisciplina(code));
    }

    public void listarDiciplinas() {

        for (Disciplinas disciplinado : disciplina) {
            
            System.out.printf("Disciplina: %s / Carga horaria: %d\n", disciplinado.getCodigo(), disciplinado.getCargaHoraria());
        }
    }
}
