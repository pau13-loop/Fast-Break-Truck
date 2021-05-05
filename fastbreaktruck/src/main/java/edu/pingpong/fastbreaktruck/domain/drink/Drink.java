package edu.pingpong.fastbreaktruck.domain.drink;

public abstract class Drink implements Cloneable{
    
    private String id;
    String NAME;
    float PVP;

    abstract void draw();

    public String getName() {
        return NAME;
    }

    public Float getPvp() {
        return PVP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
