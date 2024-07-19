package com.myproject;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("myDog", 3);
        System.out.println(myDog.name);
        myDog.move();
    }

}
