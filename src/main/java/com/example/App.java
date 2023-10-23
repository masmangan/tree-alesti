package com.example;

import java.util.HashMap;
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

    PrefixTree() {
        root = new Node('*');
        size = 0;
    }

    public boolean isEmpty() {
        return root.children.isEmpty();
    }

    public void add(String s) {
        Node n = root;

        for (char c : s.toCharArray()) {
            Node child = n.children.get(c);
            if (child == null) {
                child = new Node(c);
                n.children.put(c, child);
                size++;
            }
            n = child;
        }
        n.isWord = true;

    }

    public int size() {
        return size;
    }

}

public class App {
    public static void main(String[] args) {
        System.out.println("PrefixTree!");

        PrefixTree tree = new PrefixTree();
        System.out.println(tree.isEmpty());
    }
}
