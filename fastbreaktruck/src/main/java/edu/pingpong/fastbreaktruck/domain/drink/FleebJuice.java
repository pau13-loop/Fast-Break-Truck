package edu.pingpong.fastbreaktruck.domain.drink;

public class FleebJuice extends Drink {

    public FleebJuice() {
        NAME = "Fleeb Juice";
        PVP = 10;
    }

    @Override
    public void draw() {
        System.out.println("Inside FleebJuice::draw() method.");
    }
}
