package com.company;

import static org.junit.Assert.*;

/**
 * Created by cof on 2016-05-11.
 */
public class CcTest {
    @org.junit.Test
    public void testRebecka() throws Exception {
        String s = "Rebecka";
        String testResult = Cc.aTillZ(s);
        assertEquals("Uhehfnd", testResult);
    }

    @org.junit.Test
    public void testJohan() throws Exception {
        String s = "Johan";
        String testResult = Cc.aTillZ(s);
        assertEquals("Mrkdq", testResult);
    }

    @org.junit.Test
    public void testMurriGlimmis() throws Exception {
        String s = "Murri och Glimmis! 123567?\n    Murri&Glimmis Murri,Glimmis";
        String testResult = Cc.aTillZ(s);
        assertEquals("Pxuul rfk Jolpplv! 123567?\n" +
                "    Pxuul&Jolpplv Pxuul,Jolpplv", testResult);
    }

    //Pxuul
    @org.junit.Test
    public void testRebex() throws Exception {
        String s = "Rebex";
        String testResult = Cc.aTillZ(s);
        assertEquals("Uhehå", testResult);
    }

    @org.junit.Test
    public void testXyz() throws Exception {
        String s = "XYZxyz";
        String testResult = Cc.aTillZ(s);
        assertEquals("ÅÄÖåäö", testResult);
    }

    @org.junit.Test
    public void testBigAbcd() throws Exception {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ";
        String testResult = Cc.aTillZ(s);
        assertEquals("DEFGHIJKLMNOPQRSTUVWXYZÅÄÖABC", testResult);
    }

    @org.junit.Test
    public void testSmallAbcd() throws Exception {
        String s = "abcdefghijklmnopqrstuvwxyzåäö";
        String testResult = Cc.aTillZ(s);
        assertEquals("defghijklmnopqrstuvwxyzåäöabc", testResult);
    }
    @org.junit.Test
    public void testYxskaftbud() throws Exception {
        String s = "Yxskaftbud, ge vår WC-zonmö IQ-hjälp.";
        String testResult = Cc.aTillZ(s);
        assertEquals("Äåvndiwexg, jh yau ZF-örqpc LT-kmbos.", testResult);
    }
    @org.junit.Test
    public void testLynx() throws Exception {
        String s = "Mr. Jock, TV quiz PhD, bags few lynx.";
        String testResult = Cc.aTillZ(s);
        assertEquals("Pu. Mrfn, WY txlö SkG, edjv ihz oäqå.", testResult);
    }
}