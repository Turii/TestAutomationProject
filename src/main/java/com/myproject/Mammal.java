package com.myproject;

public abstract class Mammal extends AbstractAnimal implements Movable{
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println(name + "is walking.");
    }
}
