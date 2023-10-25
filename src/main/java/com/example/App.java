package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    final char value;
    final Map<Character, Node> children;
    boolean isWord;

    public Node(char value) {
        this.value = value;
        children = new HashMap<>();
        isWord = false;
    }
}

class PrefixTree {
    private final Node root;
    private int size;
    private int words;

    PrefixTree() {
        this.root = new Node('*');
        this.size = 0;
        this.words = 0;
    }

    public boolean isEmpty() {
        return this.root.children.isEmpty();
    }

    public void add(String s) {
        Node n = this.root;

        for (char c : s.toCharArray()) {
            Node child = n.children.get(c);
            if (child == null) {
                child = new Node(c);
                n.children.put(c, child);
                this.size++;
            }
            n = child;
        }
        if (n.isWord == false) {
            n.isWord = true;
            this.words++;
        }

    }

    public int getWords() {
        return this.words;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        List<String> result = new ArrayList<>();
        for (char c : root.children.keySet()) {
            toString0(root.children.get(c), "", result);
        } 
        return result.toString();
    }

    private void toString0(Node n, String prefix, List<String> result) {
        String prefix2 = prefix + n.value;
        if (n.isWord) {
            result.add(prefix2);
        }
        for (char c : n.children.keySet()) {
            toString0(n.children.get(c), prefix2, result);
        }        
    }

    public void dump() {
        dump0(this.root, "");
    }

    private void dump0(Node n, String prefix) {
        String prefix2 = prefix + n.value;
        if (n.isWord) {
            System.out.println(prefix2);
        }
        for (char c : n.children.keySet()) {
            dump0(n.children.get(c), prefix2);
        }
    }

    public void preOrder() {
        preOrder0(this.root);
    }

    private void preOrder0(Node n) {
        System.out.println(n.value);
        for (char c : n.children.keySet()) {
            preOrder0(n.children.get(c));
        }
    }

    public void postOrder() {
        postOrder0(this.root);
    }

    private void postOrder0(Node n) {
        for (char c : n.children.keySet()) {
            postOrder0(n.children.get(c));
        }
        System.out.println(n.value);
    }

}

public class App {
    public static void main(String[] args) {
        System.out.println("PrefixTree!");

        PrefixTree tree = new PrefixTree();
        tree.add("casamento");
        tree.add("casa");
        tree.add("bola");

        System.out.println(tree.isEmpty());
        System.out.println(tree.toString());
        
    }
}
