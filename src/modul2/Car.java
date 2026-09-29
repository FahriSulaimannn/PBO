/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author fahri
 */
public class Car {
    int cadence;
    int speed;
    int gear;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void printInfo() {
        System.out.println("Cadence: " + cadence);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + (gear + (gear + gear)));
        System.out.println("--------------------");
    }
}
