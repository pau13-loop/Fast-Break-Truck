package edu.pingpong.fastbreaktruck.domain.cereals;

public class Eyeholes extends Cereals {

    public Eyeholes() {
        NAME = "Eyeholes";
        PVP = 15;
    }

    @Override
    public void draw() {
        System.out.println("Inside Eyeholes::draw() method.");
    }
}
