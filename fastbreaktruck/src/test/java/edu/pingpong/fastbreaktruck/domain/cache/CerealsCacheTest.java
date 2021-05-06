package edu.pingpong.fastbreaktruck.domain.cache;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.fastbreaktruck.domain.cereals.Cereals;
import edu.pingpong.fastbreaktruck.domain.cereals.Eyeholes;
import edu.pingpong.fastbreaktruck.domain.cereals.Plumbus;

public class CerealsCacheTest {

    private CerealsCache cerealsCache = new CerealsCache();
    private Cereals plumbus = new Plumbus();

    @Before
    public void setupEnvelop() {
        plumbus.setId("plumbus");
        cerealsCache.loadCache();
    }


    @Test
    public void testSizeMap() {
        assertEquals(3, cerealsCache.getLengthMap());
    }

    @Test
    public void getCerealsTest() {
        assertEquals(plumbus.getName(), cerealsCache.getCereals("plumbus").getName());
        assertEquals(plumbus.getId(), cerealsCache.getCereals("plumbus").getId());
    }
    
}
