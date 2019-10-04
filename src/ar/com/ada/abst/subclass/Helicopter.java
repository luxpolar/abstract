package ar.com.ada.abst.subclass;

import ar.com.ada.abst.abst.Vehicle;

import java.util.Objects;

public class Helicopter extends Vehicle {
    protected String type;

    public Helicopter() {

    }
    public Helicopter(String type) {
        this.type = type;
    }
    public Helicopter(String type, String model, Integer seats, Boolean isInTheAir) {
        super(model, seats, isInTheAir);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void peelOff() {
        if (this.getIsInTheAir()) {
            System.out.println("Amigo uste ya despegó hace rato!");
        } else {
            System.out.println("Ajusten sus cinturones!!!");
            this.setIsInTheAir(true);
        }
    }

    @Override
    public void touchDown() {
        if (this.getIsInTheAir()) {
            System.out.println("Esto es un aterrizaje de emergencia!!! NOOOOOO!!!");
            this.setIsInTheAir(false);
        } else {
            System.out.println("Primero despegá amigo!");
        }
    }
    @Override
    public String toString() {
        return "Helicopter { type = " + type + " }";
    }

    @Override
    public int hashCode() {
        return -54 * Objects.hash(this.type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Helicopter)) return false;
        Helicopter that = (Helicopter) obj;
        return this.type.equals(that.type) &&
                super.equals(that);
    }

}
