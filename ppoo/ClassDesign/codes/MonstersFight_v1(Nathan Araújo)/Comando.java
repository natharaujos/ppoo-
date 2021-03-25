/**
 * Essa classe armazena as informacoes sobre um comando que foi digitado 
 * pelo usuario. Um comando consiste em duas strings: uma palavra
 * de comando e uma segunda palavra (por exemplo, se a entrada for 
 * "transformar vampiro", entao as duas strings serao "transformar" e "vampiro").
 * @author  Luiz Merschmann
 * @version 29/11/2020
 */

public class Comando {
    private String primeiraPalavra;
    private String segundaPalavra;
    /**
     * Cria um objeto comando. Primeira e segunda palavras devem ser 
     * fornecidas, mas qualquer uma (ou ambas) podem ser null.
     * @param primeiraPalavra A primeira palavra do comando. 
     * @param segundaPalavra A segunda palavra do comando.
     */
    public Comando(String primeiraPalavra, String segundaPalavra) {
        this.primeiraPalavra = primeiraPalavra;
        this.segundaPalavra = segundaPalavra;
    }
    /**
     * Verifica se a primeira palavra do comando eh desconhecida
     * @return true se a primeira palavra eh desconhecida.
     */
    public boolean ehDesconhecido() {
        return primeiraPalavra == null;
    }
    /**
     * Retorna a primeira palavra do comando.
     * @return A primeira palavra de comando.
     */
    public String getPalavraDeComando() {
        return primeiraPalavra;
    }
    /**
     * Verifica se o comando tem a segunda palavra
     * @return true se o comando tem uma segunda palavra.
     */
    public boolean temSegundaPalavra() {
        return segundaPalavra != null;
    }
    /**
     * Retorna a segunda palavra do comando.
     * @return A segunda palavra de comando.
     */
    public String getSegundaPalavra() {
        return segundaPalavra;
    } 
}
