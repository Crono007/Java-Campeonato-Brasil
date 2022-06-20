
/**
 * Partida: esta classe modelo deve representa uma partida de um jogo de
 * futebol, incluindo, data, horário da partida, bem como os clubes e os 
 * escores obtidos no jogo.
 *
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

//cria partida
//cria times
//seta gols dos times
public class Partida
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    private Pontuacao[] time;//lista de partidas - Conta[] lista
    private String data;
    private int hora;
    private int posTime; //posicao
    private int numeroTime;
    private int quantDeTimes;
    private String nomeDoTime1, nomeDoTime2;
    private  int numDaPartida;
    private int resultado1,resultado2;
    
    

    /**
     * Construtor para objetos da classe Partida
     */
    public Partida ()
    {
        // inicializa variáveis de instância
        //quantDeTimes = 2;
        time = new Pontuacao[2];
        data = "29/06";
        hora = 1;
        nomeDoTime1 = "";
        posTime = 1;
    }
    /**
     * Método que instancia 2 objetos e define valores iniciais aos mesmos apartir
     * de parametros definidos.
     */
    public boolean insereTimes(int numeroTime1,String time1, int numeroTime2,String time2,int golP,int golC,int horaDoJogo)
    {
        if(posTime==time.length) return false;
        
        
        time[0] = new Pontuacao(numeroTime1, time1);
        time[0].calcGols(golP,golC);
        time[1] = new Pontuacao(numeroTime2, time2);
        time[1].calcGols(golC,golP);
        resultado1 = golP;
        resultado2 = golC;
        nomeDoTime1 = time1;
        nomeDoTime2 = time2;
        hora = horaDoJogo;
        posTime++;
        return true;
    }
    
    
    
    
    public void scoreGols(int golP, int golC)
    {
        time[posTime].calcGols(golP,golC);
    }
    
    public String toString()
    {
        String msg ="Data"+data+"Hora"+hora+ "Time: " + nomeDoTime1+ "X" + "Time: " + nomeDoTime2 + "Resultado: "+resultado1+"X"+resultado2;
        return msg;
    }
    
    /**
     * exibe a lista de partidas
     */
    /*
    public String toString()
    {
        return "Partida "+ numvariavel + "Data:"+"Hora:"+ "-" + "|"+Pontuacao.toString(Pontuacao.getTime())+"|"+"X"+"|"+time2+"|"+"Gols:"+ gol1 +"X"+Gol2;
    }
    */
}
