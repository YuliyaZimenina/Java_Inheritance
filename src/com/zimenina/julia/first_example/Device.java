package com.zimenina.julia.first_example;

//Parent class

public class Device {

    // Fields of the parent class

    private String name;
    private String sound;


    // Default constructor
    public Device() {
    }

    //Parameterized constructors
    public Device(String name) {
        this.name = name;
    }

    public Device(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // Methods of the parent class
    public void show() {
        System.out.println("Device name: " + this.name);
    }

    public void sound() {
        System.out.println("Device Sound: " + this.getSound());
    }

    public void desc() {
        System.out.println("Description of the device");

        if (name != null && name != " " && name != "") {
            this.show();
        }

        System.out.println("Device Sound: " + this.getSound());
    }
}
