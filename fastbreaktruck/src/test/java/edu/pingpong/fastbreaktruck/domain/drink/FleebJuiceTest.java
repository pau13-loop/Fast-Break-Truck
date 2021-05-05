package edu.pingpong.fastbreaktruck.domain.drink;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FleebJuiceTest {
    
    private FleebJuice fleeb = new FleebJuice();

    @Test
    public void testGetters() {
        assertEquals("Fleeb Juice", fleeb.getName());
        assertEquals(10, fleeb.getPvp(), 0.01);
    }
}
