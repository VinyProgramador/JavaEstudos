
package banconubank;

public class Bd implements ExInterface{

    @Override
    public void conectar() {
        System.out.println("Conectado ao MYSQL!!");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado ao MYSQL..");
    }
    
}
