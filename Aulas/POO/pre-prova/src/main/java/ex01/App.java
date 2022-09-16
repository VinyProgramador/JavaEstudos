package ex01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasseSocial pessoa = new ClasseSocial();
        Double rendaUser;
        System.out.println("Digite sua renda");
        rendaUser = sc.nextDouble();
        pessoa.salarios(rendaUser);
        sc.close();
    }
    
}
