package com.example;



class Node {
    char value;
}

class PrefixTree {
    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public void add(String s) {
        // TODO: dividir em letras da esquerda 
        // para direita e inserir na árvore
        // Um nodo para cada letra a partir do root
        
    }

}


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "PrefixTree!" );

        PrefixTree tree = new PrefixTree();
        System.out.println(tree.isEmpty());
    }
}
