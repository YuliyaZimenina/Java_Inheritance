package com.zimenina.julia.second_example;

import java.util.Scanner;

// Class inherited

public class Student extends Man {

    // Fields of the inheritor class
    private int yearOfStudy;


    // Constructors of the inherited class
    public Student() {
    }

    public Student(String name, int yearOfStudy) {
        super(name);
        this.yearOfStudy = yearOfStudy;
    }

    // Getters and Setters
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }


    // Methods of the inheritor class
    public void inputYearOfStudy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter the year: ");
        yearOfStudy = scanner.nextInt();
        System.out.println ("Year of the beginning of training: " + yearOfStudy);
    }

    public void changeYearOfStudy() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println ("Change your year of study:");
        yearOfStudy = scanner1.nextInt();
        System.out.println ("Changed year of study: " + yearOfStudy);
    }

    // Overridden parent class method
    public void show() {
        System.out.println(yearOfStudy);
    }

    public void showInfo() {
        super.show();
        System.out.println(yearOfStudy);
    }
}

