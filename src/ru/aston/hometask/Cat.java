package ru.aston.hometask;

public class Cat extends Mammal implements Wool {
    private String breed;

    @Override
    public void hasWool() {
        System.out.println("The cat has wool");
    }
}
