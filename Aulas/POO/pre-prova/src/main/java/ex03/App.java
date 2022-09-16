package ex03;

import java.util.Scanner;
import javax.sql.rowset.spi.SyncFactory;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerificarPrimo verificarNum = new VerificarPrimo();
        Integer numDig = 0;
        System.out.println("Digite o numero para saber se é primo");
        numDig = sc.nextInt();
        verificarNum.verificarNumDig(numDig);

        while (numDig >= 0) {
            System.out.println("Programa ainda não fechou, digite mais um numero para ver se é primo!");
            numDig = sc.nextInt();
            verificarNum.verificarNumDig(numDig);
        }
    }
}
