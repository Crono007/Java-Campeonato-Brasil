
/**
 * Write a description of class AppAgencia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AppAgencia
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        Agencia ag = new Agencia("Tabajara Bank", 15);
        int opcao;
        
        System.out.print("\f");
        do{
            System.out.println("---- MENU ----");
            System.out.println("1 - Cria conta");
            System.out.println("2 - Lista contas");
            System.out.println("3 - Cancela conta");
            System.out.println("4 - Operações de conta");
            System.out.println("0 - Sai do programa");
            System.out.print("Informe a opçao:");
            opcao = in.nextInt();
            
            switch(opcao){
                case 0: System.out.println("Fim do programa"); break;
                
                case 1: System.out.println("\n>>>Cria conta");
                        boolean result = ag.insere();
                        if(result==true) System.out.println("Conta criada com sucesso\n");
                        else System.out.println("Operaçao nao realizada\n");
                        break;
                        
                case 2: System.out.println("\n>>>Lista contas");
                        System.out.println(ag.toString());
                        break;
                    
                case 3: System.out.println("\n>>>Cancela conta");
                        System.out.print("Informe o numero da conta a excluir:");
                        int num = in.nextInt();
                        result = ag.exclui(num);
                        if(result==true) System.out.println("Conta cancelada com sucesso\n");
                        else System.out.println("Operaçao nao realizada\n");
                        break;
                        
                case 4 : operacoesConta(ag);
                        break;
                    
                default: System.out.println("Opçao invalida"); 
                
            }
            
        }while(opcao!=0);
    }    
    
    private static void operacoesConta(Agencia ag)//tem que passar por parametro para usar o class Conta | private pq tem que passar pelo main
    {
            Scanner in = new Scanner(System.in);
            System.out.print("\f");
            int opcao;
        do{
            System.out.println("\n---- MENU - Operações de conta ----");
            System.out.println("1 - Consultar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Retornar ao menu anterior");
            System.out.print("Informe a opçao:");
            opcao = in.nextInt();
            switch(opcao)
            {
                case 0: System.out.println("Voltando ao menu anterior...");break;
                
                case 1: System.out.println(">>>Consultar");
                        System.out.println("Informe o numero da conta a consultar: ");
                        int num = in.nextInt();
                        Conta conta1 = ag.buscaConta(num);
                        if(conta1==null) System.out.println("Conta não encontrada");
                        else
                        {
                            System.out.println("Dados da conta:\n");
                            System.out.println(conta1.toString());
                        }
                        break;
                case 2: System.out.println(">>>Depositar");
                        System.out.println("Informe o numero da conta a Depositar: ");
                        num = in.nextInt();
                        conta1 = ag.buscaConta(num);
                        if(conta1==null) System.out.println("Conta não encontrada");
                        else
                        {
                            System.out.println("Dados da conta:\n");
                            System.out.println(conta1.toString());
                            System.out.println("Informe o valor do deposito: ");
                            double val = in.nextDouble();
                            boolean result = conta1.depositar(val);
                            if(result==true)
                            {
                                System.out.println("Saldo atualizado após depósito;\n");
                                System.out.println(conta1.toString());
                                System.out.println("Deposito realizado com sucesso");
                            }
                        }
                        break;
                case 3: System.out.println(">>>Sacar");
                        System.out.println("Informe o numero da conta a Sacar: ");
                        num = in.nextInt();
                        conta1 = ag.buscaConta(num);
                        if(conta1==null) System.out.println("Conta não encontrada");
                        else
                        {
                            System.out.println("Dados da conta:\n");
                            System.out.println(conta1.toString());
                            System.out.println("Informe o valor do saque: ");
                            double val = in.nextDouble();
                            boolean result = conta1.sacar(val);
                            if(result==true)
                            {
                                System.out.println("Saldo atualizado após saque;\n");
                                System.out.println(conta1.toString());
                                System.out.println("Saque realizado com sucesso");
                            }
                        }
                        break;
                case 4: System.out.println(">>>Transferir");
                        System.out.println("Informe o numero origem: ");
                        num = in.nextInt();
                        Conta origem = ag.buscaConta(num);
                        if(origem==null) System.out.println("Conta de origem não encontrada");
                        else
                        {
                            System.out.println("Informe o numero origem: ");
                            num = in.nextInt();
                            Conta destino = ag.buscaConta(num);
                            
                            
                            if(destino == null) System.out.println("Conta de destino não encontrada");
                            else if(origem==destino) System.out.println("Erro. As contas de origem e destino não pode ser a mesma.");
                                else
                                   { 
                                    System.out.println("Conta de origem: "+ origem.toString());
                                    System.out.println("Conta de Destino: "+ destino.toString());
                                    System.out.println("Informe o valor de transferencia: ");
                                    double val = in.nextDouble();
                                    boolean result = origem.transferir(destino,val);
                                    if(result==true) 
                                    {
                                       System.out.println("Transferencia realizada com sucesso.");
                                       System.out.println("Conta de origem: "+ origem.toString());
                                       System.out.println("Conta de Destino: "+ destino.toString());
                                    } 
                                    else System.out.println("Operacao não realizada");
                                   }
                        }
                        break;
            }
        }while(opcao!=0);
    }
}
