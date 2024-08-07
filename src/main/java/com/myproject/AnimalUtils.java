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
        } else {
            System.out.println(num + "The number is not positive");
        }

        return num > 0;
    }


    public static int findDogByName(String name, Dog[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
                return i;
            }
        }

        return -1;
    }


    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {

                return mid;
            }

            else if (array[mid] < target) {

                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }


}
