package edu.pingpong.fastbreaktruck.domain.cache;

import java.util.Hashtable;

import edu.pingpong.fastbreaktruck.domain.drink.Drink;
import edu.pingpong.fastbreaktruck.domain.drink.FleebJuice;
import edu.pingpong.fastbreaktruck.domain.drink.Licor43;
import edu.pingpong.fastbreaktruck.domain.drink.TurbulentJuice;

public class DrinkCache {

    // Create map with all kinds of cereals
    private static Hashtable<String, Drink> drinksMap = new Hashtable<>();

    // Get cereal object from map and make a clone of it
    public static Drink getDrinks(String drinkId) {
        Drink cachedDrink = drinksMap.get(drinkId);
        return (Drink) cachedDrink.clone();
    }

    // Create cereal objects and add the objects to the dictionary to afterwards be
    // able to make a copy of them
    public static void loadCache() {
        FleebJuice fleebjuice = new FleebJuice();
        fleebjuice.setId("fleeb");
        drinksMap.put(fleebjuice.getId(), fleebjuice);

        TurbulentJuice turbulentJuice = new TurbulentJuice();
        turbulentJuice.setId("turbulent");
        drinksMap.put(turbulentJuice.getId(), turbulentJuice);

        Licor43 licor = new Licor43();
        licor.setId("licor");
        drinksMap.put(licor.getId(), licor);
    }

    // Get Length Map
    public int getLengthMap() {
        return this.drinksMap.size();
    }
}
