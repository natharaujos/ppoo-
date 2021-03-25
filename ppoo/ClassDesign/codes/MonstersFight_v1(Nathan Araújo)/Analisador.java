import java.util.Scanner;

/**
 * Esse analisador le a entrada do usuario e tenta interpreta-la como um
 * comando formado por duas palavras. Ele retorna o comando como um objeto 
 * da classe Comando.
 * O analisador consulta um conjunto de palavras de comando conhecidas. Ele 
 * compara a entrada do usuario com os comandos conhecidos e, se a entrada 
 * nao for um dos comandos conhecidos, ele retorna um objeto comando que eh 
 * marcado como um comando desconhecido.
 * @author Luiz Merschmann
 * @version 29/11/2020
 */
public class Analisador {
    private PalavrasComando palavrasDeComando;
    private Scanner entrada;

    public Analisador() {
        palavrasDeComando = new PalavrasComando();//contém a lista de palavras de comando válidas
        entrada = new Scanner(System.in);
    }
    
    public Comando pegarComando() {
        String linha;
        String palavra1 = null;
        String palavra2 = null;
        
        System.out.print(">> ");//exibe o prompt
        linha = entrada.nextLine();//lê toda linha de comando
        //Tenta encontrar no máximo duas palavras
        Scanner tokenizador = new Scanner(linha);
        if(tokenizador.hasNext()){
            palavra1 = tokenizador.next();//obtém a primeira palavra do comando
            if(tokenizador.hasNext()){
                palavra2 = tokenizador.next();//obtém a segunda palavra do comando
                //Ignora o restante da linha se o comando tiver mais do que duas palavras
            }
        }
        //Verifica se a primeira palavra do comando é válida
        if(palavrasDeComando.ehComando(palavra1)){
            return new Comando(palavra1, palavra2);//Cria um comando
        }
        else{
            return new Comando(null, palavra2);//Cria um comando com null (para comando desconhecido)
        }
    }
    
    public String getComandosDisponiveis() {

        return palavrasDeComando.getComandosValidos();
    }
}
