package com.myproject;

public class Parrot extends Bird{
    private String color;
    public Parrot(String name, int age) {
        super(name, age);
    }

    public Parrot(String name, int age, int weight, String color) {
        super(name, age, weight);
        this.color = color;
    }


    @Override
    public void makeSound() {
        System.out.println(name + " says: few.");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
