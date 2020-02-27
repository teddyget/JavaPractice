package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindromeFirst() {
        assertTrue(Palindrome.isPalindromeFirst("101"));
    }

    @Test
    public void isPalindromeSecond() {
        assertEquals(Palindrome.isPalindromeSecond("fdsafdsa"), false);
    }

    @Test
    public void isPalindromeThird() {
    }

    @Test
    public void isPalindromeNumber() {

    }
}