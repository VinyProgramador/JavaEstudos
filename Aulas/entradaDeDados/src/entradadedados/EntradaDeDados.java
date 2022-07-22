package entradadedados;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String x;
        x = sc.next();
        System.out.println("Exemplo String: "+ x);
        
        
        int y;
        y = sc.nextInt();
        System.out.println("Exemplo int: "+y);
        
        
        double z;
        z = sc.nextDouble();
        System.out.println("Exemplo double: "+ z);
        
        
        double w;
        w = sc.nextDouble();
        System.out.printf("Exemplo imprimindo com virgula double: %.2f%n",w);
        
        char v;
        v = sc.next().charAt(0);
        System.out.println("Exemplo com char: "+ v);        
        
        sc.close();
    }
    
}
