
/**
 * Write a description of class Agencia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Agencia
{
    private Conta[] lista;
    private int posicao;
    private String nome;
    private int numeracaoConta;
    
    public Agencia (String nomeDaAgencia, int quantidadeContas){
        if(quantidadeContas<10) quantidadeContas = 10;
        lista = new Conta[quantidadeContas];
        nome = nomeDaAgencia;
        posicao = 0;
        numeracaoConta = 100;
    }
    
    public boolean insere(){
        if(posicao==lista.length) return false;
        lista[posicao] = new Conta(numeracaoConta);
        numeracaoConta++;
        posicao++;
        return true;
    }
    
    public int buscaIndice(int numero){
        for(int i=0; i<posicao; i++){
            if(lista[i].getNumero()==numero) return i;
        }
        return -1;
    }
    
    public Conta buscaConta(int numero)//referencia semte a valida ou null
    {
        for(int i=0;i<posicao; i++)
        {
            if(lista[i].getNumero()==numero) return lista[i];
        }
        return null;
    }
    
    public boolean exclui(int numero){
        int indice = buscaIndice(numero);
        if(indice==-1) return false;
        for(int i=indice; i<posicao-1; i++){
            lista[i] = lista[i+1];
        }
        posicao--;
        lista[posicao] = null;
        return true;
    }
    public String toString(){
        String msg = "Agencia: " + nome + "\n";
        if(posicao==0) return msg + "Sem contas cadastradas\n";
        for(int i=0; i<posicao; i++){
            msg = msg + lista[i].toString() + "\n";
        }
        return msg;
    }
}






