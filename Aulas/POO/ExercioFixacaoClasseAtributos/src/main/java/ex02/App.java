
package ex02;

public class App {

    public static void main(String[] args) {
        Funcionario  funcionario = new Funcionario();
        ReajusteSalario reajusteSalario = new ReajusteSalario();
        funcionario.setName("Viny");
        funcionario.setImposto(1000.0);
        funcionario.setSalarioBruto(6000.0);
        
        System.out.println(funcionario.toString());
        reajusteSalario.impostoSalario(funcionario);
        reajusteSalario.aumentarSalario(funcionario, 2.0);
    }
    
}
