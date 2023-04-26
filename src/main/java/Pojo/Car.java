package Pojo;

import enums.CarBody;
import enums.VehicleType;

import java.util.Objects;

public class Car extends Transport {
    private CarBody carBody;
    private VehicleType vehicleType;

    public Car(String brand, String model, double engineVolume, CarBody carBody, VehicleType vehicleType) {
        super(brand, model, engineVolume);
        this.carBody = carBody;
        this.vehicleType = vehicleType;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" +
                carBody +
                ", " + vehicleType +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        if (!super.equals(o)) return false;
        return getCarBody() == car.getCarBody() && getVehicleType() == car.getVehicleType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCarBody(), getVehicleType());
    }
}
