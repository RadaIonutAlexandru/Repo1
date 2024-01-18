package org.example.Exercitii332;

public class ElonsToyCar {
    private static final int DRIVE_DISTANCE = 20;
    private static final int BATTERY_DRAIN_PERCENTAGE = 1;

    private int distanceDriven;
    private int batteryPercentage;

    private ElonsToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage > 0) {
            return "Battery at " + batteryPercentage + "%";
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += DRIVE_DISTANCE;
            batteryPercentage -= BATTERY_DRAIN_PERCENTAGE;
            if (batteryPercentage < 0) {
                batteryPercentage = 0;
            }
        }
    }
}

