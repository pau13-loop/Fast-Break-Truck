package edu.pingpong.fastbreaktruck.domain.cereals;

public class Smiggles extends Cereals{

    public Smiggles() {
        NAME = "Smiggles";
        PVP = 50;
    }

    @Override
    public void draw() {
        System.out.println("Inside Smiggles::draw() method !");
    }
}
