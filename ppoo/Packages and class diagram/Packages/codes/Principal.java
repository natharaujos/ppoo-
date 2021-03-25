import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Departamento departamento = new Departamento("DAC");
        int option;
        String codigo;
        int cargaHoraria;

        System.out.println("########### SISTEMA DE CADASTRO ###########");
        System.out.println("1 - Cadastrar nova disciplina");
        System.out.println("2 - Remover disciplina");
        System.out.println("3 - Listar todas as disciplinas");
        System.out.println("4 - Sair");
        
        option = entrada.nextInt();

        while(option != 4) {

            if (option == 1) {

                System.out.print("Digite o codigo da disciplina: ");
                codigo = entrada.next();
                System.out.print("Digite o codigo da carga horaria: ");
                cargaHoraria = entrada.nextInt();
                Disciplinas materias = new Disciplinas(codigo, cargaHoraria);
                departamento.adicionarDisciplina(materias);
            }

            else if (option == 2) {

                String delete;
                System.out.print("Digite o nome da disciplina a ser removida: ");
                delete = entrada.next();
                departamento.removerDiciplina(delete);

            }

            else if (option == 3) {

                departamento.listarDiciplinas();
            }

            System.out.println("########### SISTEMA DE CADASTRO ###########");
            System.out.println("1 - Cadastrar nova disciplina");
            System.out.println("2 - Remover disciplina");
            System.out.println("3 - Listar todas as disciplinas");
            System.out.println("4 - Sair");
            
            option = entrada.nextInt();
        }
    }
}
