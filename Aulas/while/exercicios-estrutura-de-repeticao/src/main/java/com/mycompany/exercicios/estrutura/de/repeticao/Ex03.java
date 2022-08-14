package com.mycompany.exercicios.estrutura.de.repeticao;

//Escreva um aplicativo em Java mostra todos os números pares de 1 até 100.
public class Ex03 {

    public static void main(String[] args) {
        Integer num1 = 0;
        while (num1<100) {
            num1 += 2;
            System.out.println("Numero: "+num1);
        }
    }
}
