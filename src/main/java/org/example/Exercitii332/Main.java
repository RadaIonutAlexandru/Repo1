package org.example.Exercitii332;

public class Main {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();

        System.out.println(car.distanceDisplay()); // "Mers 0 metrii"
        System.out.println(car.batteryDisplay()); // "Baterie la 100%"

        car.drive();
        car.drive();

        System.out.println(car.distanceDisplay()); // "Mers 40 metrii"
        System.out.println(car.batteryDisplay()); // "Baterie 98%"

        // Drain the battery
        for (int i = 0; i < 10; i++) {
            car.drive();
        }

        System.out.println(car.distanceDisplay()); // "Parcurs 200 metrii"
        System.out.println(car.batteryDisplay()); // "Baterie 88%"

        // Drain the battery completely
        for (int i = 0; i < 100; i++) {
            car.drive();
        }

        System.out.println(car.distanceDisplay()); // "Parcurs 200 metrii"
        System.out.println(car.batteryDisplay()); // "Baterie goala"
    }
}

