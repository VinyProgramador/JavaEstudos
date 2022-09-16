package ex03;

public class VerificarPrimo {

    void verificarNumDig(Integer numDig) {
        Integer divisores = 0;
        for (int i = 1; i <= numDig; ++i) {
            if (numDig % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("Numero primo!");
        } else {
            System.out.println("Numero não é primo!");
        }
    }
}
