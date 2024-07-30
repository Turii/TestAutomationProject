package com.myproject;

import java.util.List;

public class Parrot extends Bird{
    private String color;
    public Parrot(String name, int age) {
        super(name, age);
    }

    public Parrot(String name, int age, List<String> colors) {
        super(name, age, colors);
    }


    @Override
    public void makeSound() {
        System.out.println(name + " says: few.");
    }


    /*public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }*/
}
