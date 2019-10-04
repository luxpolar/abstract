package ar.com.ada.abst.subclass;

import ar.com.ada.abst.abst.Vehicle;

import java.util.Objects;

public class Airplane extends Vehicle {
    private String airline;

    public Airplane() {

    }

    public Airplane(String airline) {
        this.airline = airline;
    }

    public Airplane(String airline, String model, Integer seats, Boolean isInTheAir) {
        super(model, seats, isInTheAir);
    }


    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
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
        return "Airplane { airline = " + airline + " }";
    }

    @Override
    public int hashCode() {
        return -3 * Objects.hash(this.airline);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Airplane)) return false;
        Airplane that = (Airplane) obj;
        return this.airline.equals(that.airline) &&
                super.equals(that);
    }
}
