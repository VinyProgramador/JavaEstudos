package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String dia = "O dia da semana é:";

        switch (num1) {
            case 1:
                System.out.println(dia + " Domingo!");
                break;
            case 2:
                System.out.println(dia + " Segunda!");
                break;
            case 3:
                System.out.println(dia+" Terça!");
                break;
            case 4:
                System.out.println(dia+" Quarta!");
                break;
            case 5:
                System.out.println(dia+" Quinta!");
                break;
            case 6:
                System.out.println(dia+" Sexta!!!");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }

        sc.close();
    }

}
