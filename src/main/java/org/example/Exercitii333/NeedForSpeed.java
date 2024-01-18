package org.example.Exercitii333;

public class NeedForSpeed {
    class needForSpeed {
        private int speed;
        private int batteryDrain;
        private int distanceDriven;
        private int batteryPercentage;

        public needForSpeed(int speed, int batteryDrain) {
            this.speed = speed;
            this.batteryDrain = batteryDrain;
            this.distanceDriven = 0;
            this.batteryPercentage = 100;
        }

        public void drive() {
            if (!batteryDrained()) {
                distanceDriven += speed;
                batteryPercentage -= batteryDrain;
            }
        }

        public int distanceDriven() {
            return distanceDriven;
        }

        public boolean batteryDrained() {
            return batteryPercentage <= 0;
        }

        public static needForSpeed nitro() {
            return new needForSpeed(50, 4);
        }
    }

    class RaceTrack {
        private int distance;

        public RaceTrack(int distance) {
            this.distance = distance;
        }

        public boolean carCanFinish(needForSpeed car) {
            int maxPossibleDistance = car.distanceDriven() + (car.batteryPercentage / car.batteryDrain) * car.speed;
            return maxPossibleDistance >= distance;
        }
    }

    public class Main {
        public void main(String[] args) {
            int speed = 5;
            int batteryDrain = 2;
            needForSpeed car = new needForSpeed(speed, batteryDrain);

            car.drive();
            System.out.println("Distance driven: " + car.distanceDriven()); // => 5
            System.out.println("Battery drained: " + car.batteryDrained()); // => false

            needForSpeed nitroCar = needForSpeed.nitro();
            nitroCar.drive();
            System.out.println("Distance driven by Nitro: " + nitroCar.distanceDriven()); // => 50

            int distance = 100;
            RaceTrack race = new RaceTrack(distance);
            System.out.println("Can car finish the race? " + race.carCanFinish(car)); // => true
        }
    }
}
