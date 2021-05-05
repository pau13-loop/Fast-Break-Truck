package edu.pingpong.fastbreaktruck.domain.envelop;

public class Bottle extends Envelop{
    
    public Bottle() {
        NAME = "Bottle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Bottle::draw() method.");
    }
}
