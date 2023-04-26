package Config;

import Pojo.Bus;
import Pojo.Car;
import Pojo.Driver;
import Pojo.Truck;
import enums.Capacity;
import enums.CarBody;
import enums.LoadCapacity;
import enums.VehicleType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("BMW", "X5", 5.0, CarBody.CROSSOVER, VehicleType.CAR);
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Toyota", "B45", 6.5, Capacity.MEDIUM, VehicleType.BUS);
    }

    @Bean(name = "truck")
    public Truck getTruckBean() {
        return new Truck("Man", "T50", 6.0, LoadCapacity.N2, VehicleType.TRUCK);
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Thom", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Paul", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Jack", getTruckBean());
    }
}
