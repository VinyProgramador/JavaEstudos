
package banconubank;

import javax.swing.JOptionPane;

public class BancoNubank {

    public static void main(String[] args) {

       /*Conta contaNubank = new Conta();
       
       contaNubank.depositar(100);
       contaNubank.sacar(30);
       contaNubank.verSaldo();
*/       
       
       //Conta corrente 
       //ContaCorrente contaCorrenteNubank = new ContaCorrente();
       //contaCorrenteNubank.depositar(100);
       //contaCorrenteNubank.sacar(30);
       //contaCorrenteNubank.verSaldo();
       
       
       //Conta poupança
       //ContaPoupanca contaPoupancaNubank = new ContaPoupanca();
       //contaPoupancaNubank.depositar(100);
       //contaPoupancaNubank.sacar(30);
       //contaPoupancaNubank.verSaldo();
       
       //Exemplo de Interface:
        Bd b = new Bd();
        b.conectar();
        
        //Exemplo Polimorfismo: 
        String acao = JOptionPane.showInputDialog("Digite seu tipo de conta!");
        
        Conta conta;
           if(acao.equals("corrente")){
                conta = new ContaCorrente();
                conta.depositar(100);
                conta.verSaldo();
        }
           else if(acao.equals("poupanca")){
                conta = new ContaPoupanca();
                conta.depositar(100);
                conta.verSaldo();
        }
           else{
               System.out.println("Não existe esta opção de conta digitada.");
        }
    }      
 }
  
