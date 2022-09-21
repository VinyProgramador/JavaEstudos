package sleep.metodo.de.espera;

public class App {

    public static void main(String[] args) {
        Integer n = 0;
        while (true) {            
            n++;
            System.out.println("Contagem do numero: "+n);
            try {
                Thread.sleep(3000);
            } catch (Exception error) {
            }
        }
    }
    
}
