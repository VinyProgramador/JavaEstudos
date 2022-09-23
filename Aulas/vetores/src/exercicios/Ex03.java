package exercicios;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer qtdDeNum = 0;
        System.out.println("Digite a quantidade de numeros que voce quer ler:");
        qtdDeNum = sc.nextInt();
        Integer[] vect = new Integer[qtdDeNum];

        for (int i = 0; i <qtdDeNum; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos: ");
        for (int i = 0; i <qtdDeNum; i++) {
            if (vect[i]<0) {
                System.out.println(vect[i]);
            }
        }      
        sc.close();
    }

}
