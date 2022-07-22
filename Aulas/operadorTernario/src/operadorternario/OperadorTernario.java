package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
  
        double preco = 34.5;
        double desconto = (preco<20) ? preco * 0.01 : preco * 0.05;
        System.out.println("O desconto doi de: "+desconto);
    }
    
}
