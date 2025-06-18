package ru.aston.hometask;

public abstract class Mammal extends Animal implements Spine {

    @Override
    public void hasSpine() {
        System.out.println("Mammal has spine");
    }
}
