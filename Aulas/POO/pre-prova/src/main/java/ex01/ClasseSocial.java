package ex01;

public class ClasseSocial {
    Double salarios(Double rendaUser){
        Double qtdSalarios = rendaUser / 1080;
        String classeUser;
        System.out.println(String.format("Voce recebe aproximadamente: %.2f salarios", qtdSalarios));
        if(qtdSalarios<= 2){
            classeUser = "E";
        }
        else if(qtdSalarios<=4){
            classeUser = "D";
        }
        else if(qtdSalarios <=10){
            classeUser ="C";
        }
        else if(qtdSalarios <=20){
            classeUser = "B";
        }
        else{
            classeUser = "A";
        }
        System.out.println(String.format("Voce pertence a classe %s", classeUser));
        return qtdSalarios;
    }
}
