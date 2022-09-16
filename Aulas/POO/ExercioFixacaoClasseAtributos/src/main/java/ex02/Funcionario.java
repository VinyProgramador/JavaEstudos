package ex02;

public class Funcionario {
    String nome;
    Double salarioBruto = 0.0;
    Double imposto = 0.0;

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Name: " + nome + "\n"
                + "Salario bruto: " + salarioBruto + "\n"
                + "imposto: " + imposto;
    }
    
    
}
