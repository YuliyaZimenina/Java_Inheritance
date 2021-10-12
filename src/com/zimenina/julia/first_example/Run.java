package com.zimenina.julia.first_example;

/*
 Create base class "Device" and derivatives
classes "Kettle", "Microwave", "Car",
"Steamer". Set the name using the constructor
each device and its characteristics.
Implement methods for each of the classes:
 * Sound - emits the sound of the device (we write in text in
 console);
* Show - displays the name of the device;
 * Desc - displays a description of the device.
 */

public class Run {
    public static void main(String[] args) {


        Device device = new Device();
        device.setName("Hair dryer");
        device.setSound("Ууууу");
        device.show();
        device.sound();
        System.out.println();
        device.desc();
        System.out.println();


        Kettle kettle = new Kettle();
        kettle.setName("Kettle");
        kettle.setSound("Pssssss");
        kettle.setManufacturer("Polaris");
        kettle.setMaterial("Пластик");
        kettle.show();
        kettle.sound();
        System.out.println();
        kettle.desc();
        System.out.println();


        Microwave microwave = new Microwave();
        microwave.setName("Microwave");
        microwave.setSound("Mmmmmmmm");
        microwave.setManufacturer("Bosch");
        microwave.setMaterial("Металлопластик");
        microwave.show();
        microwave.sound();
        System.out.println();
        microwave.desc();
        System.out.println();


        Steamer steamer = new Steamer();
        steamer.setName("Steamer");
        steamer.setSound("Tuuu-Tuuuuuu");
        steamer.setManufacturer("North Stars");
        steamer.setMaterial("Steel, titanium");
        steamer.show();
        steamer.sound();
        System.out.println();
        steamer.desc();
        System.out.println();


        Car car = new Car();
        car.setName("Car");
        car.setSound("Rum-rum-rum");
        car.setManufacturer("BMW");
        car.setMaterial("Steel, aluminum");
        car.show();
        car.sound();
        System.out.println();
        car.desc();
        System.out.println();
    }
}

