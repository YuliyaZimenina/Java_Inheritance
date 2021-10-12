package com.zimenina.julia.second_example;

// Class parent

public class Man {

    // Fields of the parent class
    private String name;
    private int age;
    private int weight;

    // Constructors of the parent class
    public Man() {

    }

    public Man(String name) {
        this.name = name;
    }

    public Man(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getters and Setters
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Methods of the parent class
    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
    }
}
