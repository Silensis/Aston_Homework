package ru.aston.hometask;

public class Fish extends Animal implements Water{
    private String waterType;

    @Override
    public void liveInWater() {
        System.out.println("Fish live in water");
    }
}
