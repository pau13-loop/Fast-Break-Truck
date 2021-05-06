package edu.pingpong.fastbreaktruck.domain.cache;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.fastbreaktruck.domain.drink.Drink;
import edu.pingpong.fastbreaktruck.domain.drink.TurbulentJuice;

public class DrinkCacheTest {
    
    private DrinkCache drinksCache = new DrinkCache();
    private Drink turbulent = new TurbulentJuice();

    @Before
    public void setupEnvelop() {
        turbulent.setId("turbulent");
        drinksCache.loadCache();
    }


    @Test
    public void testSizeMap() {
        assertEquals(3, drinksCache.getLengthMap());
    }

    @Test
    public void getBottleTest() {
        assertEquals(turbulent.getName(), drinksCache.getDrinks("turbulent").getName());
        assertEquals(turbulent.getId(), drinksCache.getDrinks("turbulent").getId());
    }
}
