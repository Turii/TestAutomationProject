package com.myproject;

public class Dog extends Mammal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: hav.");
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }


}
