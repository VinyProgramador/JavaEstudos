package com.mycompany.produtos.no.estoque;

import java.util.Scanner;

public class Produto {    
    String nome;
    Double preco;
    Integer quantidade;

    public Double ValorTotalEstoque() {
        return preco*quantidade;
    }
    public void AddProdutos(Integer quantidade){
        this.quantidade += quantidade;
    }
    public void  RemoverProdutos(Integer quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return nome+", preço R$"+String.format("%.2f", preco)+", "
                +quantidade+" unidades, Total: "
                +String.format("%.2f", ValorTotalEstoque());
    }
}
