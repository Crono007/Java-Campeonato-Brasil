
/**
 * Classe modelo que cria o objeto Time.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pontuacao

{
    private int cod;
    public String time;
    public int ponto;
    public int jogos;
    public int vitorias;
    public int empates;
    public int derrotas;
    public int gp;
    public int gc;
    public int sg;
    public double aprov;
    
    public Pontuacao()
    {
        cod = 0;
        time = "";
        ponto = 0;
        jogos = 0;
        vitorias = 0;
        empates = 0;
        derrotas = 0;
        gp = 0;
        gc = 0;
        sg = 0;
        aprov = 0.0;
    }
    /**
     * Este construtor cria o objeto time com os atributos iniciais definidos nesta classe.
    */
    
    public Pontuacao (int cod, String time)
    {
        
        if(cod>=1) this.cod = cod;
        else cod = 0;
        
        if(time!=this.time) this.time = time;
        else time = "";
    }
    
    public int getCod()
    {
        return cod;
    }
    
    public String getTime()
    {
        return time;
    }
        
    public int getGp()
    {
        return gp;
    }
    
    public int getGc()
    {
        return gc;
    }
    
    public int getSg()
    {
        return sg;
    }
    
    public int getVitorias()
    {
        return vitorias;
    }
    
    public int getEmpates()
    {
        return empates;
    }
    
    public int getDerrotas()
    {
        return derrotas;
    }
    
    public int getPonto()
    {
        return ponto;
    }
    
    public int getJogos()
    {
        return jogos;
    }
    
    /**
     * metodo criado no tipo void pois não retorna nada, modifica e atualiza 
     * atributos determinados anteriormente nesta classe com dados informados pela
     * Class ****.
    */
    public void calcGols(int p,int c)
    {
        gp = gp + p;//0
        gc = gc + c;//0
        
        if(p>c) 
        {
            ponto = ponto + 3;
            vitorias++;
        }    
        if(p==c)
        {
            ponto = ponto + 1;
            empates++;
        }        
        if(p<c) 
        {
            derrotas++;
        }
        jogos++;
    }
    
    /**
     * Realiza o cálculo so saldo de gols baseado nos resultados dos gols pró e 
     * gols contra.
     */
    public int somaSaldo()
    {
        sg = gp-gc;
        return sg;
    }
    
    /**
     * Efetua o percentual de aproveitamento do time com base na pontuação e jogos.
     */
    public double somaAproveitamento()
    {
        if(jogos==0) return 0;
        return  (double)ponto/(jogos*3)*100;
    }
    
    public String toString()
    {
        return "\n["+getCod()+"]"+"   ["+getTime()+"]"
        +"\n                        ["+getPonto()+"]"
        +"   ["+getJogos()+"]"+ "   ["+getVitorias()+"]" + "   ["+getEmpates()+"]" 
        + "   ["+getDerrotas()+"]" +"    ["+getGp()+"]"+"    ["+getGc()+"]"+
        "    ["+somaSaldo()+"]" + "     ["+somaAproveitamento()+"]";
    }
}
