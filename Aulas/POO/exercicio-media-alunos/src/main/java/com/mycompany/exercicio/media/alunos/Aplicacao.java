package com.mycompany.exercicio.media.alunos;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno01 = new Aluno();
        System.out.println("Olá Aluno, digite seu nome: ");
        aluno01.nome = sc.nextLine();
        System.out.println("Digite sua primeira nota: ");
        aluno01.n1 = sc.nextInt();
        System.out.println("Digite sua segundo nota: ");
        aluno01.n2 = sc.nextInt();
        System.out.println("Digite sua terceira nota: ");
        aluno01.n3 = sc.nextInt();
        Integer MediaDoAluno = aluno01.Media();

        if (MediaDoAluno < 6) {
            System.out.println(aluno01.nome + ", infelizmente voce não passou de ano sua media foi de " + MediaDoAluno + " tente novamente ano que vem..");
        } else {
            System.out.println(aluno01.nome + ", voce passou de ano e sua media foi de: " + MediaDoAluno);
        }

        sc.close();
    }
}
