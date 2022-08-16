package com.mycompany.exercicios.estrutura.lacos;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseDigitada;

        System.out.println("Digite uma frase e ela sera repetida 7x!");

        fraseDigitada = sc.nextLine();

        for (Integer i = 0; i <= 7; i++) {

            System.out.println(+i+"x, "+fraseDigitada);

        }
        sc.close();
    }
}
