package aplicacao;

import entidades.Triangulo;
import java.util.Locale;
import java.util.Scanner;

//Exemplo de exercicio sem POO

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        
        x = new Triangulo();
        y = new Triangulo();
        
        
        System.out.println("Digite as medidas do triangulo X");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo Y");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
