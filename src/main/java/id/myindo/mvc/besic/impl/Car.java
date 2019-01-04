package id.myindo.mvc.besic.impl;

import id.myindo.mvc.besic.service.Vehicle;
import org.springframework.stereotype.Service;

@Service("Car")
public class Car implements Vehicle {
    private String brand;
    private String type;
    private String engine;
    private String transmission;
    private String fuel;
    private String motion;


    public  Car(){
        brand="";
        type = "";
        engine="";
        transmission="";
        fuel="";
        motion="";
    }

    public Car(String brand, String type, String engine, String transmission, String fuel) {
        this.brand = brand;
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMotion() {
        return motion;
    }

    public void setMotion(String motion) {
        this.motion = motion;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }

    @Override
    public String move() {
        return motion;
    }
}
