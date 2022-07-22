
package banconubank;


public final class ContaCorrente extends Conta{
    
    
    //Reescrevendo o métododa classe pai
    // Com overriding
    @Override
    public void sacar(double valor){
    
        super.sacar(valor);
        this.juro();
        
    } 
    
    public void juro(){
        this.saldo -= 1.50;
        System.out.println("O juros de 1.50 é acionado ao sacar da conta.");
    }
}
