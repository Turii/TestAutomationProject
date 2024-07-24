package com.myproject;

public abstract class Bird extends AbstractAnimal implements Movable{
    protected int weight;
    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird(String name, int age, int weight) {
        super(name, age);
        this.weight  = weight;

    }

    @Override
    public void move() {
        System.out.println(name + "is flying.");
    }


}
