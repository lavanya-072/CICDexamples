package com.Example.CICDexamples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {

    @Test
    void addTest() {
        SimpleCal cal = new SimpleCal();
        assertEquals(13, cal.add(5, 8));
    }

    @Test
    void multiplyTest() {
        SimpleCal cal = new SimpleCal();
        assertEquals(25, cal.mul(5, 5));
    }
}
