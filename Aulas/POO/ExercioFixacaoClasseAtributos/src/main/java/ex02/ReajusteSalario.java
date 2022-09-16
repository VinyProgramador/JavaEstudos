package ex02;

public class ReajusteSalario {

    void impostoSalario(Funcionario funcionario) {
        funcionario.setSalarioBruto(funcionario.getSalarioBruto() - funcionario.getImposto());
        System.out.println(String.format("Com o imposto aplicado seu salario sera de: %.2f", funcionario.getSalarioBruto()));
    }

    void aumentarSalario(Funcionario funcionario, Double porcentagemAumento) {

        if (porcentagemAumento <= 0) {
            System.out.println("Numeros invalidos não são aceitos.");
        } else {
            porcentagemAumento = porcentagemAumento / 100;
            funcionario.setSalarioBruto((funcionario.getSalarioBruto() * porcentagemAumento) + funcionario.getSalarioBruto());
            System.out.println(String.format("Seu novo salario é de: %.2f", funcionario.getSalarioBruto()));
            System.out.println(String.format("Seus novos dados atualizados!\n"
                    + "%s", funcionario.toString()));
        }
    }

}
