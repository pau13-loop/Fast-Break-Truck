package edu.pingpong.fastbreaktruck.domain.envelop;

public class Box extends Envelop{
    
    public Box() {
        NAME = "Box";
    }

    @Override
    public void draw() {
        System.out.println("Inside Box::draw() method.");
    }
}
