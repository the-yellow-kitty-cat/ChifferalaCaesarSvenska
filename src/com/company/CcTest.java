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
}