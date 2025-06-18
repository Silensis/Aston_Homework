package ru.aston.hometask;

public class Bear extends Mammal implements Wool {
    private String species;


    @Override
    public void hasWool() {
        System.out.println("The bear has wool");
    }
}
