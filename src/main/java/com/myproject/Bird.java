package com.myproject;

public abstract class Bird extends AbstractAnimal implements Movable{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println(name + "is flying.");
    }
}
