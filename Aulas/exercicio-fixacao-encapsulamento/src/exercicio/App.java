package exercicio;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        String nome = "Viny";
        Integer numeroDaConta = 303;
        Double DepositoInicial = 200.0;
        
        ContaBancaria c1 = new ContaBancaria(nome, numeroDaConta, DepositoInicial);
        c1.Sacar(500.0, c1);
        c1.Depositar(-5.0, c1);
        c1.Depositar(10.0, c1);
        System.out.println();
        System.out.println(c1.toString());
        c1.Sacar(40.0, c1);
        System.out.println();
        System.out.println(c1.toString());
    }
    
}
