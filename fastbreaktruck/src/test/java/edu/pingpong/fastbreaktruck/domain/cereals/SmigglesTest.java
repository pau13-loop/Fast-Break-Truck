package edu.pingpong.fastbreaktruck.domain.cereals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmigglesTest {
    
    private Smiggles smiggles = new Smiggles();

    @Test
    public void testGetters() {
        assertEquals("Smiggles", smiggles.getName());
        assertEquals(15, smiggles.getPvp(), 0.01);
    }
}
