package contructor;

import entities.Produtos;

public class Contructor {

    public static void main(String[] args) {
        Produtos produtos = new Produtos("Tv", 1, 900.0f);
        
        System.out.println(produtos.toString());
        
        produtos.setNome("Ps5");
        System.out.println("Nome atualizado para: " + produtos.getNome());
        
        produtos.setValor(4000f);
        System.out.println("Valor atualizado " + produtos.getValor());
        
        System.out.println(produtos.toString());
    }
}

