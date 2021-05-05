package edu.pingpong.fastbreaktruck.domain.cereals;

public abstract class Cereals implements Cloneable {

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
