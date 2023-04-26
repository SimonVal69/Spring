package Pojo;

import enums.Capacity;
import enums.VehicleType;

import javax.annotation.PostConstruct;
import java.util.Objects;

public class Bus extends Transport {
    private Capacity capacity;
    private VehicleType vehicleType;

    public Bus(String brand, String model, double engineVolume, Capacity capacity, VehicleType vehicleType) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
        this.vehicleType = vehicleType;
    }

    @PostConstruct
    private void init() {
        System.out.println(getVehicleType() + " готов к работе");
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Bus{" +
                capacity +
                ", " + vehicleType +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        if (!super.equals(o)) return false;
        return getCapacity() == bus.getCapacity() && getVehicleType() == bus.getVehicleType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCapacity(), getVehicleType());
    }
}
