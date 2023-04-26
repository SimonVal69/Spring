package Pojo;

import enums.LoadCapacity;
import enums.VehicleType;

import java.util.Objects;

public class Truck extends Transport {
    private LoadCapacity loadCapacity;
    private VehicleType vehicleType;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, VehicleType vehicleType) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
        this.vehicleType = vehicleType;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Truck{" +
                loadCapacity +
                ", " + vehicleType +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck truck)) return false;
        if (!super.equals(o)) return false;
        return getLoadCapacity() == truck.getLoadCapacity() && getVehicleType() == truck.getVehicleType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLoadCapacity(), getVehicleType());
    }
}
