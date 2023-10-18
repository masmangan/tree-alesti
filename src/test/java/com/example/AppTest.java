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
}
