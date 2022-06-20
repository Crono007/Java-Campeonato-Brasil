public class Partida
  {
    private String data, hora;
    private int codigoTime;
    private Pontuacao time1;

    public Partida()
    {
      data = "";
      hora = "";
      codigoTime = 0;
    }

    //public Partida(String timeA, String timeB, int codA, int codB)
    public Partida(Pontuacao timeA, Pontuacao timeB, Pontuacao cod1)
    {
      /*
      time1 = timeA;
      codigoTime = timeA.getCod();
      nomeA = timeA.getNome();*/
      int codigo1 = cod1;
      time1 = (timeA, cod1);
    }
    public void setGolsEdit()
    {
      return;
    }
    
    public void setGolsEdit()
    {
      return;
    }

    public getTime()
    {
      time = Pontuacao.getTime();
    }

    public String toString()
    {
      
    }
  
  }