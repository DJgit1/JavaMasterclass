package com.dj;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;
    @org.junit.Before
    public void setUp() {
        util = new Utilities();
    }
    @org.junit.Test
    public void everyNthChar() {
//        Utilities utils = new Utilities();
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char[] output2 = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @org.junit.Test
    public void removePairs() {
//        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was nul", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));

    }

    @org.junit.Test
    public void converter() {
//        Utilities util = new Utilities();
        assertEquals(300,util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmaticException() throws Exception {
//        Utilities util = new Utilities();
        util.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
//        Utilities util = new Utilities();
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}