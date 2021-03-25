/**
 * Essa classe armazena uma lista com todos os comandos validos do jogo. Ela eh
 * usada para se checar a validade dos comandos digitados pelo usuario. 
 * @author Luiz Merschmann
 * @version 29/11/2020
 */
public class PalavrasComando {
    private static final String[] comandosValidos = {"transformar", "lutar","sair","ajuda", "observar"};
    /**
     * Verifica se uma String eh uma palavra de comando valida. 
     * @return true se a string dada eh um comando valido ou false caso contrario.
     */
    public boolean ehComando(String palavra1) {
        for (int i = 0; i < comandosValidos.length; i++) {
            if(comandosValidos[i].equalsIgnoreCase(palavra1)){
                return true;
            }
        }
        return false;
    }

    public String getComandosValidos() {

        String comandosDisponiveis = " ";

        for (String comando : comandosValidos) {

            comandosDisponiveis = comandosDisponiveis + comando + " ";
        }

        return comandosDisponiveis;
    }
    
}
