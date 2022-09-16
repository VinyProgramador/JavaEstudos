package ex02;

public class DescontoProgressivo {

    Double calcularDesconto(Double valorPdt, Integer qtdPdt) {
        System.out.println("Bem vindo ao sistema de desconto progressivo: ");
        System.out.println(String.format("Valor do produto: %.2f", valorPdt));
        System.out.println(String.format("Quantidade %d", qtdPdt));

        Double descontoPdt = 0.0;
        Double valorPdtAtualizado = valorPdt * qtdPdt; 
        if (qtdPdt == 1) {
            descontoPdt = valorPdtAtualizado - (valorPdtAtualizado * 0.10);
        } else if (qtdPdt == 2) {
            descontoPdt = valorPdtAtualizado - (valorPdtAtualizado * 0.20);
        } else {
            descontoPdt = valorPdtAtualizado - (valorPdtAtualizado * 0.30);
        }
        System.out.println(String.format("Valor do produto com desconto: %.2f", descontoPdt));
        return descontoPdt;
    }
}
