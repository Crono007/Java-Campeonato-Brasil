/**
 * Escreva uma descrição da classe Conta aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Conta
{
    private int numero;
    private double saldo;
    
    public Conta(int numero){
        this.numero = numero;
        saldo=0;
    }
    
    public int getNumero(){ return numero;}
    public double getSaldo() { return saldo;}
    
    public boolean sacar(double valor){
        if(valor>0 && valor<=saldo) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    
    public boolean depositar(double valor){
        if(valor>0){
            saldo = saldo + valor;
            return true;
        }
        return false;
    }
    
    public boolean transferir(Conta destino, double valor){
        if(sacar(valor)==true){
            if(destino.depositar(valor)==true) return true;
            else depositar(valor);
        }
        return false;
    }
    public String toString(){
        return "Conta: " + numero + " Saldo: R$ " + saldo;
    }
}