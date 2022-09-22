package exercicio02;

public class CarroCorrida {

    Integer numeroCarro;
    String piloto;
    String equipe;
    Float velocidadeMaxima;
    Float velocidadeAtual;
    Boolean ligado;
    Boolean parado;

    public CarroCorrida(Integer numeroCarro, String piloto, String equipe, Float velocidadeMaxima, Float velocidadeAtual, Boolean ligado, Boolean parado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
        this.parado = parado;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getParado() {
        return parado;
    }

    public void setParado(Boolean parado) {
        this.parado = parado;
    }

    public void Acelerar(CarroCorrida carro, Float valorAcelerar) {
        if (carro.ligado != true) {
            System.out.println("Seu carro não está ligado, impossivel acelerar.");
        }
        else if(carro.getVelocidadeAtual() + valorAcelerar > 300){
            System.out.println("Não dá para ultrpassar velocidade maxima!");
        }
        else {
            Float valorAtual = carro.getVelocidadeAtual();
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() + valorAcelerar);
            System.out.println(String.format("Voce aumentou a velocidade de seu carro que era de %.2f e agora está em %.2f",
                    valorAtual, carro.getVelocidadeAtual()));
        }
    }

    public void Frear(CarroCorrida carro, Float valorFreio) {
        if (carro.ligado == true) {
            Float valorAtual = carro.getVelocidadeAtual();
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() - valorFreio);
            System.out.println(String.format("Voce diminuiu a velocidade de seu carro que era de %.2f e agora esta em %.2f",
                    valorAtual, carro.getVelocidadeAtual()));
        }
        else{
            System.out.println("Seu carro está desligado não dá para frear.");
        }
    }

    public void Parar(CarroCorrida carro) {
        carro.setParado(true);
        System.out.println("Parando carro..");
    }

    public void Desligar(CarroCorrida carro) {
        if (carro.getParado() == true) {
            carro.setLigado(false);
            System.out.println("Desligando carro..");
        } else {
            System.out.println("Seu carro ainda não está parado para desliga-lo.");
        }
    }

    public void Ligar(CarroCorrida carro) {
        if (carro.getLigado() == false) {
            carro.setLigado(true);
            System.out.println("Ligando carro..");
        } else {
            System.out.println("Seu carro já está ligado.");
        }
    }

}
