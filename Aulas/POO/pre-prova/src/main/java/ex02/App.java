package ex02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DescontoProgressivo compra = new DescontoProgressivo();
        Double valorPdt;
        Integer qtdPdt;
        System.out.println("Digite o valor do Pdt");
        valorPdt = sc.nextDouble();
        System.out.println("Digite a qtd: ");
        qtdPdt = sc.nextInt();
        compra.calcularDesconto(valorPdt, qtdPdt);
        sc.close();
    }
    
}
