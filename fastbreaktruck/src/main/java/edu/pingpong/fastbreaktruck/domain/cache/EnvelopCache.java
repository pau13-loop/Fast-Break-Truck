package edu.pingpong.fastbreaktruck.domain.cache;

import java.util.Hashtable;

import edu.pingpong.fastbreaktruck.domain.envelop.Envelop;
import edu.pingpong.fastbreaktruck.domain.envelop.Bottle;
import edu.pingpong.fastbreaktruck.domain.envelop.Box;

public class EnvelopCache {
    
    // Create map with all kinds of cereals
    private static Hashtable<String, Envelop> envelopsMap = new Hashtable<>();

    // Get cereal object from map and make a clone of it
    public static Envelop getEnvelop(String envelopId) {
        Envelop cachedEnvelop = envelopsMap.get(envelopId);
        return (Envelop) cachedEnvelop.clone();
    }

        // Create cereal objects and add the objects to the dictionary to afterwards be able to make a copy of them
        public static void loadCache() {
            Bottle bottle = new Bottle();
            bottle.setId("bottle");
            envelopsMap.put(bottle.getId(), bottle);
    
            Box box = new Box();
            box.setId("box");
            envelopsMap.put(box.getId(), box);
        }

        // Get Length Map
        public int getLengthMap() {
            return this.envelopsMap.size();
        }
}
