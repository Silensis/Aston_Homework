package ru.aston.hometask.Vehicles;

public class Boat extends Vehicles implements Screw, TransportsCargo{
    private double length;
    private double width;
    private double masSpeed;
    private int passengersCapacity;

    @Override
    public void hasScrew() {

    }

    @Override
    public void canTransportCargo() {

    }
}