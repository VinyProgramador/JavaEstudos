package banconubank;

public abstract class Conta {
        
        
    protected double saldo;
    public int contaUsuario;
    
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
        else{
         System.out.println("Voce não tem esse valor para ser sacaod, sua conta atual tem: "+this.saldo);
        }
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void verSaldo(){
        System.out.println("Seu saldo é de: "+this.saldo);
    }
}
