package edu.pingpong.fastbreaktruck.domain.cache;

import static org.junit.Assert.assertEquals;

import java.lang.annotation.Target;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.fastbreaktruck.domain.envelop.Bottle;
import edu.pingpong.fastbreaktruck.domain.envelop.Envelop;

public class EnvelopCacheTest {
    
    private EnvelopCache envCache = new EnvelopCache();
    private Envelop bottle = new Bottle();

    @Before
    public void setupEnvelop() {
        bottle.setId("bottle");
        envCache.loadCache();
    }


    @Test
    public void testSizeMap() {
        assertEquals(2, envCache.getLengthMap());
    }

    @Test
    public void getBottleTest() {
        assertEquals(bottle.getName(), envCache.getEnvelop("bottle").getName());
        assertEquals(bottle.getId(), envCache.getEnvelop("bottle").getId());
    }
}
