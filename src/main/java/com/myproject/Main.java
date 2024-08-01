package com.myproject;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static com.myproject.AnimalUtils.binarySearch;
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


        int[] array = {2, 5, 6, 77, 20, 3, 11};
        int target = 20;
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("not present");
        } else {
            System.out.println("present");
        }





    List<String> catNames2 = new ArrayList<>();
        catNames2.add("Kitty");
        catNames2.add("Mittens");
        catNames2.add("Cutty");
    List<Integer> catAges = new ArrayList<>();
       catAges.add(2);
       catAges.add(4);
       catAges.add(3);
    List<Cat> myCatsListwithAge = new ArrayList<>();

       for (int i = 0; i < catNames2.size(); i++) {
        Cat cat = new Cat(catNames2.get(i), catAges.get(i));
        myCatsListwithAge.add(cat);
    }

       for (Cat cat : myCatsListwithAge) {
        System.out.println(cat.getName() + " (age: " + cat.getAge() + ")");
        cat.makeSound();
        cat.eat();
        cat.sleep();
    }

    Integer[] ageArray = catAges.toArray(new Integer[0]);
       Arrays.sort(ageArray);

    int targetAge = 3;
    int resultCatAge = Arrays.binarySearch(ageArray, targetAge);
       if (resultCatAge < 0) {
        System.out.println("Age " + targetAge + " not present in the list");
    } else {
        System.out.println("Age " + targetAge + " is present in the list");
    }
}

}
