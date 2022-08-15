package com.mycompany.exercicio.media.alunos;

public class Aluno {

    public String nome;
    public Integer n1;
    public Integer n2;
    public Integer n3;
    
    public Integer Media(){
        Integer mediaFinal = (n1+n2+n3)/3;
        return mediaFinal;
    }
}
