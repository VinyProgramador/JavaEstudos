package aplicacao;

import entidades.Pessoa;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa humano = new Pessoa();
        
        System.out.println("__Inscrição Exercito__");
        System.out.println("Seu nome: ");
        humano.nome = sc.next();
        System.out.println("Sua idade: ");
        humano.idade = sc.nextInt();
        System.out.println("Seu gênero: digite 01 para mulher ou 02 para homem ");
        humano.gereno = sc.next();
        
        if(humano.nome.length()<3){
            System.out.println("Nome inadequado aos termos do cadastro.");
        }
        else if(humano.idade<18){
            System.out.println("Voce ainda naão tem idade para se cadastrar!!!");
        }
        else if(humano.gereno == "01"){
            System.out.println("Olá, "+humano.nome+", mulheres não podem se increver no exercito..");
        }
        else{
            System.out.println("Olá "+humano.nome+"!, Sua inscrição foi finalizada, iremos averiguar se "
                    + "Precisaremos da sua ajuda no Exercito, fique atento!");
        }
        sc.close();
    }

}
