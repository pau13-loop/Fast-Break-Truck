package edu.pingpong.fastbreaktruck.domain.drink;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TurbulentJuiceTest {
    
    private TurbulentJuice turbulent = new TurbulentJuice();

    @Test
    public void testGetters() {
        assertEquals("Turbulent Juice", turbulent.getName());
        assertEquals(10, turbulent.getPvp(), 0.01);
    }
}
