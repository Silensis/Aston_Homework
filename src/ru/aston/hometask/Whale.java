package ru.aston.hometask;

public class Whale extends Mammal implements Water{
    private String ocean;

    @Override
    public void liveInWater() {
        System.out.println("Whale live in water");
    }
}
