package com.zimenina.julia.first_example;

//Successor class

public class Car extends Device {

    // Inheritor class fields
    private String manufacturer;
    private String material;
    private String sound;

    // Constructors
    public Car() {

    }

    public Car(String name, String manufacturer, String material) {
        super(name);
        this.manufacturer = manufacturer;
        this.material = material;
    }

    // Getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Overridden methods
    public void show() {
        super.show();
    }

    public void sound() {
        super.sound();
    }

    public void desc() {
        super.desc();
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Material: " + material);
    }
}

