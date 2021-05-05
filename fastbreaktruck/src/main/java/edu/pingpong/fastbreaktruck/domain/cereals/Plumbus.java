package edu.pingpong.fastbreaktruck.domain.cereals;

public class Plumbus extends Cereals{
    
    public Plumbus() {
        NAME = "Plumbus";
        PVP = 100;
    }

    @Override
    public void draw() {
        System.out.println("Inside Plumbus::draw() method.");
    }
}
