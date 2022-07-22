package entradadedadospt2;

import java.util.Scanner;

public class EntradaDeDadosPt2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;

        System.out.println("Digite um numero inteiro: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o primeiro dado: ");
        s1 = sc.nextLine();
        System.out.println("Digite o segundo dado: ");
        s2 = sc.nextLine();
        System.out.println("Digite o terceiro dado: ");
        s3 = sc.nextLine();

        System.out.println("Dados Digitados abaixo");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }

}
