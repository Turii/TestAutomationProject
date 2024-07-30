package com.myproject;

import java.util.ArrayList;
import java.util.List;

public abstract class Bird extends AbstractAnimal implements Movable{
    private List<String> colors;
    protected int weight;
    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird(String name, int age, List<String> colors) {
        super(name, age);
        this.colors  = new ArrayList<>(colors);
    }

    @Override
    public void move() {

        System.out.println(name + "is flying.");
    }

    @Override
    public void makeSound() {

        System.out.println(name + "says: I'm a bird.");
    }

    public List<String> getColors() {
        return colors;
    }

    public String getColor() {
        if (colors.size() == 1) {
            return colors.get(0);
        } else if (colors.size() > 1) {
            return "Multicolored";
        } else {
            return "No color";
        }
    }

    public void addColor(String color) {
        this.colors.add(color);
    }

    public void removeColor(String color) {
        this.colors.remove(color);
    }

}
