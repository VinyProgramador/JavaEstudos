package com.mycompany.exercicios.estrutura.lacos;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numDigitado;
        System.out.println("Digite um numero: ");

        numDigitado = sc.nextInt();

        for (Integer i = 1; i < numDigitado; i += 2) {
            if (i % 2 != 0) {
                System.out.println("Numeros impares até o numero que voce escolheu: " + i);
            }
        }

        sc.close();
    }
}
