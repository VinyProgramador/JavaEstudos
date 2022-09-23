package exercicios;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scText = new Scanner(System.in);
        Integer numeroDeProdutos = 0;
        System.out.println("Digite a quantidade de produtos que serão cadastrados: ");
        numeroDeProdutos = sc.nextInt();

        Produto[] vect = new Produto[numeroDeProdutos];

        for (int i = 0; i < numeroDeProdutos; i++) {
            sc.nextLine();
            System.out.println("Nome do produto:");
            String nome = sc.nextLine();
            System.out.println("Preço do produto:");
            Double preco = sc.nextDouble();

            vect[i] = new Produto(nome, preco);
        }
        Double somaPdt = 0.0;
        for (int i = 0; i < numeroDeProdutos; i++) {
            somaPdt += vect[i].getValor();
        }
        Double mediaDosPdt = somaPdt/vect.length;
        
        for (int i = 0; i < numeroDeProdutos; i++) {
            System.out.println(String.format("Produtos Informados\n %s",
                    vect[i].getNome()));
        }
        System.out.println(String.format("A media dos produtos é de: %.2f", mediaDosPdt));
    }

}
