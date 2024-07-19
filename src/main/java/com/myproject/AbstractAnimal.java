package com.myproject;

public abstract class AbstractAnimal implements Animal{
    protected String name;
    protected int age;

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(name + "is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + "is sleeping.");
    }

    @Override
    public void makeSound() {
    }
}
