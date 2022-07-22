package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numeros´para serem somados, para parar o programa digite 0");
        int x = sc.nextInt();
        //programa vai rodar ENQUANTO  eu não ditar o 0.
        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println("A soma dos valores: "+soma);
        sc.close();
    }

}
