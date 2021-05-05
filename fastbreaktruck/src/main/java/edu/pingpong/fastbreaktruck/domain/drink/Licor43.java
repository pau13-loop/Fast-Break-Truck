package edu.pingpong.fastbreaktruck.domain.drink;

public class Licor43 extends Drink{

    public Licor43() {
        NAME = "Licor 43";
        PVP = 45;
    }

    @Override
    public void draw() {
        System.out.println("Inside Licor43::draw() method.");
    }
}
