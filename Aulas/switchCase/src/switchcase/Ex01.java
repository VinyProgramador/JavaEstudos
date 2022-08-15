package switchcase;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroDigitado;
        Integer valorNaCarteira = 20;

        System.out.println("__PF do Dia__\n"
                + "Em sua carteira voce tem 20 reais.\n"
                + "Digite 1 para Arroz com feijão Valor: 15R$\n"
                + "Digite 2 para macarrão com carne moída Valor: 18R$\n"
                + "Digite 3 para Caviar Valor: 23R$");
        numeroDigitado = sc.nextInt();
        switch (numeroDigitado) {
            case 1:
                if (valorNaCarteira < 15) {
                    System.out.println("Voce não tem dinheiro sufiente");
                } else {
                    System.out.println("Voce comprou Arroz com feijão, seu troco é de: " + (valorNaCarteira - 15));
                }
                break;
            case 2:
                if (valorNaCarteira < 18) {
                    System.out.println("Voce não tem dinheiro sufiente");
                } else {
                    System.out.println("Voce comprou Macarrão com carne moída, seu troco é de: " + (valorNaCarteira - 18));
                }
                break;
            case 3:
                if (valorNaCarteira < 23) {
                    System.out.println("Voce não tem dinheiro sufiente");
                } else {
                    System.out.println("Voce comprou Caviar, seu troco é de: " + (valorNaCarteira - 23));
                }
                break;
        }
    }
}
