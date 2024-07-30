package com.myproject;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static com.myproject.AnimalUtils.findDogByName;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("myDog", 3);
        System.out.println(myDog.name);
        myDog.move();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3, node2);

        node1.next = node3;

        ListNode current = node1;
        while (current != null) {
            System.out.println(current.val + " current");
            current = current.next;
        }

        AnimalUtils.makeSoundDos();
        AnimalUtils.sum(3, 5);
        AnimalUtils.isPositive(6);

        Parrot firstParrot = new Parrot("Parrot1", 2, Arrays.asList("Blue"));
        Parrot secondParrot = new Parrot("Parrot2", 1, Arrays.asList("red", "white", "blue"));
        System.out.println(secondParrot.getColor());
        firstParrot.addColor("black");
        firstParrot.addColor("green");
        firstParrot.addColor("white");
        firstParrot.removeColor("white");
        System.out.println(firstParrot.getColor());
        System.out.println(firstParrot.getColors());

        Dog dog1 = new Dog("dog1", 3);
        Dog dog2 = new Dog("dog2", 3);
        Dog dog3 = new Dog("dog3", 3);
        Dog dog4 = new Dog("dog4", 3);
        Dog[] arrdogs = new Dog[]{dog1, dog2, dog3, dog4};
        int a = findDogByName("dog2", arrdogs);
        System.out.println(a);

        List<String> catNames = new ArrayList<>();
        catNames.add("Kitty");
        catNames.add("Mittens");
        catNames.add("Cutty");

        List<Cat> myCatsList = new ArrayList<>();

        for (String name : catNames) {
            Cat cat = new Cat(name, 3);
            myCatsList.add(cat);
        }

        for (Cat cat : myCatsList) {
            System.out.println(cat.getName() + " (age: " + cat.getAge() + ")");
            cat.makeSound();
            cat.eat();
            cat.sleep();
        }


    }

}
