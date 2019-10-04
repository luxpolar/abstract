package ar.com.ada.abst.abst;

import java.util.Objects;

public abstract class Vehicle {
    protected String model;
    protected Integer seats;
    private Boolean isInTheAir;

    public Vehicle() {

    }

    public Vehicle(String model, Integer seats, Boolean isInTheAir) {
        this.model = model;
        this.seats = seats;
        this.isInTheAir = isInTheAir;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public Integer getSeats(){
        return seats;
    }
    public void setSeats(Integer seats) {
        this.seats = seats;
    }
    public Boolean getIsInTheAir() {
        return isInTheAir;
    }
    public void setIsInTheAir(Boolean isInTheAir) {
        this.isInTheAir = isInTheAir;
    }

    public abstract void peelOff();
    public abstract void touchDown();

    @Override
    public String toString() {
        return "Vehicle { model = " + model +
                ", seats = " + seats +
                ", isInTheAir = " + isInTheAir +
                " }";
    }

    @Override
    public int hashCode() {
        return -32 * Objects.hash(this.model, this.seats, this.isInTheAir);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Vehicle)) return false;
        Vehicle that = (Vehicle) obj;
        return this.model.equals(that.model) &&
                this.seats.equals(that.seats) &&
                this.isInTheAir.equals(that.isInTheAir);
    }

}
