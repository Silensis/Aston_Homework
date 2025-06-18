package ru.aston.hometask.Vehicles;

public class Truck extends Vehicles implements Wheels, TransportsCargo{
    private double fuelCapacity;
    private double maxSpeed;

    @Override
    public void canTransportCargo() {

    }

    @Override
    public void hasWheels() {

    }
}
