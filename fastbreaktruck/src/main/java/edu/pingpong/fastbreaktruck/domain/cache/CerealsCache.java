package edu.pingpong.fastbreaktruck.domain.cache;

import java.util.Hashtable;

import edu.pingpong.fastbreaktruck.domain.cereals.Cereals;
import edu.pingpong.fastbreaktruck.domain.cereals.Eyeholes;
import edu.pingpong.fastbreaktruck.domain.cereals.Plumbus;
import edu.pingpong.fastbreaktruck.domain.cereals.Smiggles;

public class CerealsCache {
    
    // Create map with all kinds of cereals
    private static Hashtable<String, Cereals> cerealsMap = new Hashtable<>();
    
    // Get cereal object from map and make a clone of it
    public static Cereals getCereals(String cerealsId) {
        Cereals cachedCereals = cerealsMap.get(cerealsId);
        return (Cereals) cachedCereals.clone();
    }

    // Create cereal objects and add the objects to the dictionary to afterwards be able to make a copy of them
    public static void loadCache() {
        Eyeholes eyeholes = new Eyeholes();
        eyeholes.setId("eyeholes");
        cerealsMap.put(eyeholes.getId(), eyeholes);

        Smiggles smiggles = new Smiggles();
        smiggles.setId("smiggles");
        cerealsMap.put(smiggles.getId(), smiggles);

        Plumbus plumbus = new Plumbus();
        plumbus.setId("plumbus");
        cerealsMap.put(plumbus.getId(), plumbus);
    }
}
