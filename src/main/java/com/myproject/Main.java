package com.myproject;

import java.util.Arrays;

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

    }

}
