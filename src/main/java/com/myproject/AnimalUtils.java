package com.myproject;

import java.util.ArrayList;
import java.util.List;

public class AnimalUtils {
    public static void makeSoundDos() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Mario", 5));
        dogs.add((new Dog("Rex", 3)));

        for (Dog dog : dogs) {
            dog.makeSound();
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isPositive(int num) {
        if (num > 0) {
            System.out.println(num + "The number is positive");
        }
        else {
        System.out.println(num + "The number is not positive");}

        return num > 0;
    }

}
