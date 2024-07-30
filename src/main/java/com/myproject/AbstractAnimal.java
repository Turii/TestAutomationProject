package com.myproject;

public abstract class AbstractAnimal implements Animal{
    protected String name;
    protected int age;

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(name + "is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + "is sleeping.");
    }

    @Override
    public void makeSound() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
