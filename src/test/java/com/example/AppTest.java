package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void newTreeIsEmpty()
    {
        PrefixTree tree = new PrefixTree();

        boolean expected = true;
        boolean actual = tree.isEmpty();

        assertEquals( expected, actual );
    }

    @Test
    public void newTreeIsEmptyToString()
    {
        PrefixTree tree = new PrefixTree();

        String expected = "[]";
        String actual = tree.toString();

        assertEquals( expected, actual );
    }

    @Test
    public void addSingleLetter()
    {
        PrefixTree tree = new PrefixTree();
        tree.add("a");

        int expected = 1;
        int actual = tree.size();

        assertEquals( expected, actual );
    }


    @Test
    public void addSingleLetterToString()
    {
        PrefixTree tree = new PrefixTree();
        tree.add("a");

        String expected = "[a]";
        String actual = tree.toString();

        assertEquals( expected, actual );
    }

   @Test
    public void addSingleLetterTwiceToString()
    {
        PrefixTree tree = new PrefixTree();
        tree.add("a");
        tree.add("b");

        String expected = "[a, b]";
        String actual = tree.toString();

        assertEquals( expected, actual );
    }

    @Test
    public void addSingleLetterTwice()
    {
        PrefixTree tree = new PrefixTree();
        tree.add("a");

        tree.add("a");

        int expected = 1;
        int actual = tree.size();

        assertEquals( expected, actual );
    }


    @Test
    public void addTwoLetters()
    {
        PrefixTree tree = new PrefixTree();
        tree.add("ab");

        int expected = 2;
        int actual = tree.size();

        assertEquals( expected, actual );
    }

    @Test
    public void addTwoLetterAreTheSameLetter()
    {
        PrefixTree tree = new PrefixTree();
        tree.add("aa");

        int expected = 2;
        int actual = tree.size();

        assertEquals( expected, actual );
    }    

    @Test
    public void addSamePrefix()
    {
        PrefixTree tree = new PrefixTree();
        tree.add("aa");
        tree.add("aab");

        int expected = 3;
        int actual = tree.size();

        assertEquals( expected, actual );
    }  

}
