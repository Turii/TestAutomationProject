package com.myproject;

public class Cat extends Mammal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: mew.");
    }
}
