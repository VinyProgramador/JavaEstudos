package exercicio02;

public class App {

    public static void main(String[] args) {
        CarroCorrida carro1 = new CarroCorrida(554, "Viny", "Mercedes", 300f, 150f, true, false);
        carro1.Frear(carro1, 15f);
        carro1.Parar(carro1);
        carro1.Desligar(carro1);
        carro1.Acelerar(carro1, 90f);
        carro1.Ligar(carro1);
        carro1.Acelerar(carro1, 180f);
        carro1.Acelerar(carro1, 140f);
    }
    
}
