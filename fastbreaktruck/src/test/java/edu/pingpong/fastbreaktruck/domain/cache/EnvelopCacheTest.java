package edu.pingpong.fastbreaktruck.domain.cache;

import static org.junit.Assert.assertEquals;

import java.lang.annotation.Target;

import org.junit.Test;

import edu.pingpong.fastbreaktruck.domain.envelop.Bottle;
import edu.pingpong.fastbreaktruck.domain.envelop.Envelop;

public class EnvelopCacheTest {
    
    private EnvelopCache envCache = new EnvelopCache();
    private Bottle bottle = new Bottle();


    @Test
    public void testSizeMap() {
        envCache.loadCache();
        assertEquals(2, envCache.getLengthMap());
    }

    @Test
    public void getBottleTest() {

        assertEquals(bottle, envCache.getEnvelop2("bottle"));
    }
}
