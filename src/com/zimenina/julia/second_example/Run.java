package com.zimenina.julia.second_example;

/*
Create a class Man (person), with fields: name, age, gender and weight.
Determine methods for setting name, age and weight.
Create a derived class Student that has a field of study year.
Determine the methods of assigning and increasing (changing) the year of study.
Both classes must have default and parameter constructors.
In the Man class, create a show method that will display information about the person to the console.
 In the Student class, the show method must be redefined so that information about the year of study is displayed.
 */

public class Run {
    public static void main(String[] args) {

        Man man = new Man();
        man.setName("Paul");
        man.setAge(22);
        man.setWeight(75);
        man.show();
        System.out.println();

        System.out.println("Student");
        Student student = new Student();
        student.setName("Sam");
        student.setAge(18);
        student.setWeight(65);
        student.inputYearOfStudy();
        student.changeYearOfStudy();
        student.show();
        System.out.println();
        student.showInfo();
    }
}