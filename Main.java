import java.util.*;
class Main {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int quantTimes;
    //this.iniciar();
    System.out.println("\f");


    //sistema pede quant de times:
    System.out.println("Digite a quantidade de times do campeonato: ")
    quantTimes = in.nextInt();//criar vetores??;

    for(int i=0; i< quantTimes; i++)
      {
        System.out.println("Digite o nome do time");
        int Time[i] = in.nextInt();
      }
  }

  private static void iniciar() {
    
  }
}

/**
  felipe esta ai?sim
no partida nao to conseguindo iniciar 
 new pontucao gremio()
new pontuacao inter()
new partida (inter,gremio)

criar a lista ver = new listadepartida.(new partida(new Pontuacao(gremio), new Pontuacao(inter)))
new partida(new Pontuacao(gremio, cod), new Pontuacao(inter,cod))
xy = times ui = cod
 */ 