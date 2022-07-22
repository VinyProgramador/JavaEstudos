package funcoesparastring;
import java.util.Scanner;
public class FuncoesParaString {

    public static void main(String[] args) {
        String text;
        String textTest = "abc 123 defg AAA  ";
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        text= sc.next();
        
        //passando para letra minuscula
        System.out.println("Tudo em letra Minucula: "+text.toLowerCase());
        
        //passando para letra maiuscula
        System.out.println("Tudo em letra Maiuscula: "+text.toUpperCase());

        //remover espaço
        System.out.println("Sem espaços: "+textTest.trim());
            
        //pega o caractere da posição informada e cria uma nov String
        System.out.println("Nova String a partir da posição informada: "+text.substring(2));
        
        //Muda um determinado carácter a partir doque foi informado na função
        System.out.println("Muda o carácter: "+text.replace("a","*"));
        
        //Muda uma palavra interira
        System.out.println("Muda a palavra: "+text.replace("vinicius", "Viny"));
        sc.close();
        
        
        
        String palavras = "Vinicius Yuri Cris";
        String[] vect = palavras.split(" ");
        String palavra01 = vect[0];
        String palavra02 = vect[1];
        String palavra03 = vect[2];       
        
        System.out.println("Palavra na posiçaõ escolhida: "+palavra02);
        
    }
    
}
