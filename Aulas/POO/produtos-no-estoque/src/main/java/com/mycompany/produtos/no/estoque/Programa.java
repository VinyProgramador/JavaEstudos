package com.mycompany.produtos.no.estoque;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto primeiroPruduto = new Produto();

        System.out.println("__Cadastro de produto__\n"
                + "Nome");
        primeiroPruduto.nome = sc.nextLine();
        System.out.println("Preço: ");
        primeiroPruduto.preco = sc.nextDouble();
        System.out.println("Quantidade: ");
        primeiroPruduto.quantidade = sc.nextInt();
        System.out.println("Dados do produto: " + primeiroPruduto);
        System.out.println();
        System.out.println("Adicione ao estoque");
        Integer quantidade = sc.nextInt();
        primeiroPruduto.AddProdutos(quantidade);
        System.out.println("Dados do produto atualizados: " + primeiroPruduto);
        System.out.println();
        System.out.println("Remova do estoque");
        quantidade = sc.nextInt();
        primeiroPruduto.RemoverProdutos(quantidade);
        System.out.println("Dados do produto atualizados: " + primeiroPruduto);

        sc.close();
    }
}
