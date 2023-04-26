package Pojo;

import javax.annotation.PostConstruct;
import java.util.Objects;

public class Driver {
    private String name;

    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    @PostConstruct
    private void init(){
        System.out.println(getTransport().getBrand() + " готов к работе");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Водитель{" +
                "name='" + name + '\'' +
                ", " + transport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver driver)) return false;
        return Objects.equals(getName(), driver.getName()) && Objects.equals(getTransport(), driver.getTransport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTransport());
    }
}
