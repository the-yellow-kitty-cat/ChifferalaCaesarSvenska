package com.company;

import static org.junit.Assert.*;

/**
 * Created by cof on 2016-05-11.
 */
public class CcTest {
    @org.junit.Test
    public void testR() throws Exception {
        String s = "A";
        String testResult = Cc.aTillZ(s);
        assertEquals("1", testResult);
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