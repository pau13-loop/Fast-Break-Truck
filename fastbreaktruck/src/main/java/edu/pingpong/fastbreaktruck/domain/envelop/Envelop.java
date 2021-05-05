package edu.pingpong.fastbreaktruck.domain.envelop;

public abstract class Envelop implements Cloneable{
    
    private String id;
    String NAME;

    abstract void draw();

    public String getName() {
        return NAME;
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
