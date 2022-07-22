package banconubank;


public final class ContaPoupanca extends Conta{
  
    public void depositar(double valor){
        super.depositar(valor);
        this.acrescimo();
    }
    
        public void acrescimo(){
        this.saldo += 1.50;
        System.out.println("O acrescimo  de 1.50 é acionado ao depositar na conta poupança.");
    }
}
