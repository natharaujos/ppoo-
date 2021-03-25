import java.util.HashMap;

/**
 * Esta classe representa um personagem do jogo, o qual poderá participar de lutas.
 * Cada personagem eh conectado a outros indicando as possiveis transformacoes.
 * A principio as transformacoes sao lobisomen, mumia, vampiro e zumbi. Para
 * cada transformacao possivel, o personagem guarda uma referencia para o outro
 * personagem ou null se nao for possivel aquela transformacao.
 * @author Luiz Merschmann
 * @version 29/11/2020
 */
public class Personagem {
    private String identificacao;
    private int forcaAtaque;
    private int forcaDefesa;
    private HashMap<String, Personagem> hashPersonagem;
    
    public String getIdentificacao() {

        return identificacao;
    }

    public int getForcaAtaque() {
    
        return forcaAtaque;
    }

    public int getForcaDefesa() {

        return forcaDefesa;
    }

    public Personagem getP(String nome) {

        return hashPersonagem.get(nome);
    }
    /**
     * Cria um personagem com a "descricao" e habilidades (forca
     * de ataque e defesa) passadas. Inicialmente ele não pode
     * sofrer transformacoes.
     * @param descricao A descricao do personagem.
     * @param forcaAtaque A forca de ataque daquele personagem.
     * @param forcaDefesa A forca de defesa daquele personagem.
     */
    public Personagem(String descricao,int forcaAtaque, int forcaDefesa) {
        this.identificacao = descricao;
        this.forcaAtaque = forcaAtaque;
        this.forcaDefesa = forcaDefesa;
        hashPersonagem = new HashMap<String, Personagem>();
    }
    /**
     * Define as transformacoes possiveis. Cada transformacao leva a um
     * outro personagem ou eh null (transformacao impossivel).
     * @param t1 Transformar em lobisomen.
     * @param t2 Transformar em mumia.
     * @param t3 Transformar em vampiro.
     * @param t4 Transformar em zumbi.
     */
    public void definirTransformacoes(String nome, Personagem boneco){
        hashPersonagem.put(nome, boneco);
    }
    /**
     * @return A descricao do personagem.
     */
    public String getDescricao() {
        
        return identificacao + "--> Força de ataque = " + getForcaAtaque() + " " + "Força de defesa = " + getForcaDefesa();
    }

    public String getTransformacoes() {

        String textoSaida = "";
        for(String saidas : hashPersonagem.keySet()) {
            textoSaida = textoSaida + hashPersonagem.get(saidas). getDescricao() + "\n";
        }
        return textoSaida;
    }
}
