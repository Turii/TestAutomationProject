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


    public static void countCharacters() {
        String input = "aabbccddd";
        int count = 1;
        StringBuilder compressed = new StringBuilder();

        for(int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i -1)) {
                count++;
            } else {
                compressed.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }
        compressed.append(input.charAt(input.length()-1)).append(count);
        System.out.println(compressed.toString());
    }

    public static void countCharWithMap() {
        String input = "aabbccddd";

    }
    /*public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }*/
}
