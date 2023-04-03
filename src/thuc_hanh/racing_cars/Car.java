package thuc_hanh.racing_cars;

import java.util.Random;

import static thuc_hanh.racing_cars.Main.DISTANCE;
import static thuc_hanh.racing_cars.Main.STEP;

public class Car implements Runnable{
    private String name;
    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE){
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance*100)/DISTANCE;
                for (int i = 0; i < DISTANCE; i++) {
                    if (percentTravel > i + STEP){
                        log += "=";
                    } else if (percentTravel >= i && percentTravel <= i +STEP){
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log +="|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
            } catch (Exception e){
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
