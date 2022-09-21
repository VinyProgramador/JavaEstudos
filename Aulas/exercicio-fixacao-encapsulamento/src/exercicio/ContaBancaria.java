package exercicio;

public class ContaBancaria {

    private String nomeTitular;
    private Integer numeroDaConta;
    private Double saldo;

    public ContaBancaria(String nomeTitular, Integer numeroDaconta, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroDaConta = numeroDaconta;
        this.saldo = saldo;
    }

  
    
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(Double valorDeposito, ContaBancaria c1) {
        if (valorDeposito <= 0) {
            System.out.println("Depossito inválido!");
        } else {
            c1.setSaldo(saldo += valorDeposito);
            System.out.println("Deposito realizado com sucesso!");
        }
    }

    public void Sacar(Double valorSaque, ContaBancaria c1) {
        if (c1.getSaldo() - valorSaque <= 0) {
            System.out.println("Voce não tem todo este dinheiero para sacar!");
        } else {
            c1.setSaldo((c1.getSaldo() - valorSaque) - 5);
            System.out.println("Saque realizado com sucesso!");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria\n"
                + "Nome do titular: " + nomeTitular + "\n"
                + "Numero da conta:" + numeroDaConta + "\n"
                + "Saldo: " + saldo;
    }

}
