package edu.pingpong.fastbreaktruck.domain.cereals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EyeholesTest {
    
    private Eyeholes eyeholes = new Eyeholes();

    @Test
    public void testGetters() {
        assertEquals("Eyeholes", eyeholes.getName());
        assertEquals(15, eyeholes.getPvp(), 0.01);
    }
}
