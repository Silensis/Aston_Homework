package ru.aston.hometask.Vehicles;

public class Airplane extends Vehicles implements Wheels, Screw, Wings, TransportsCargo{
    private double fuelCapacity;
    private double maxSpeed;

    @Override
    public void hasScrew() {

    }

    @Override
    public void canTransportCargo() {

    }

    @Override
    public void hasWheels() {

    }

    @Override
    public void hasWings() {

    }
}