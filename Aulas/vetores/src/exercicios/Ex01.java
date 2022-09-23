package exercicios;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numeroDePessoas = sc.nextInt();
        Double[] vect = new Double[numeroDePessoas];

        for (int i = 0; i < numeroDePessoas; i++) {
            vect[i] = sc.nextDouble();
        }
        Double somaDeAturas = 0.0;
        for (int i = 0; i < numeroDePessoas; i++) {
            somaDeAturas += vect[i];
        }
        Double mediaDeAturas = somaDeAturas / numeroDePessoas;
        System.out.println(String.format("A media das alturas é de: %.2f", mediaDeAturas));

        sc.close();

    }

}
