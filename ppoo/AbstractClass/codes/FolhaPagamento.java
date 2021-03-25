import java.util.ArrayList;

import java.util.ArrayList;

public class FolhaPagamento {
    
    private ArrayList<Beneficiario> listaBeneficiarios;
    Beneficiario beneficiario;

    public FolhaPagamento() {

        listaBeneficiarios = new ArrayList<Beneficiario>();
    }

    public void cadastrarBeneficiario(Beneficiario beneficiario) {

        listaBeneficiarios.add(beneficiario);
    }

    public void gerarFolhaPagamento() {

        for (Beneficiario beneficiario : listaBeneficiarios) {

            System.out.println(beneficiario);
        }
    }
}
