package com.mycompany.exercicios.estrutura.de.repeticao;

import java.util.Scanner;

public class Ex05 {

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer Alcool = 0;
        Integer Gasolina = 0;
        Integer Diesel = 0;
        Integer valorDigitado;
        System.out.println("1.Álcool\n"
                + "2.Gasolina\n"
                + "3.Diesel\n"
                + "4.Fim");
        valorDigitado = sc.nextInt();
        while (valorDigitado != 4) {
            if (valorDigitado == 1) {
                Alcool++;
            } else if (valorDigitado == 2) {
                Gasolina++;
            } else if (valorDigitado == 3) {
                Diesel++;
            }
            valorDigitado = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);

        sc.close();
    }
}
