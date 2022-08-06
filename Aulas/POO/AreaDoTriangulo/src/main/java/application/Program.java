package application;

import java.util.Locale;
import java.util.Scanner;

//Exemplo de exercicio sem POO

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do triangulo X");

        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo Y");

        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.println("A área do triangulo X é:" + areaX);
        System.out.println("A área do triangulo Y é:" + areaY);

        if(areaX > areaY){
            System.out.println("O maior tringulo é o X");
        }
        else{
            System.out.println("O maior tringulo é o Y");
        }
        
        sc.close();
    }

}
