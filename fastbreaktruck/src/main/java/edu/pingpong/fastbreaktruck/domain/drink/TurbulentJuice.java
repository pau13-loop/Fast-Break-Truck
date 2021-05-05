package edu.pingpong.fastbreaktruck.domain.drink;

public class TurbulentJuice extends Drink{

    public TurbulentJuice() {
        NAME = "Tubulent Juice";
        PVP = 10;
    }

    @Override
    public void draw() {
        System.out.println("Inside TurbulentJuice::draw() method.");
    }
}
