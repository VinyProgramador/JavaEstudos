package com.mycompany.exercicios.estrutura.de.repeticao;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha correta: ");

        Integer senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha incorreta");
            senha = sc.nextInt();
        }

        System.err.println("Senha Valída!");
        sc.close();
    }
}
