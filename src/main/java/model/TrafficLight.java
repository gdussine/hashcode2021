package model;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficLight {
    public Integer compteur=0;

    // 0 = red, 1 = green
    private boolean green = false;
    private Road street;
    private Queue<Car> carsQueue = new LinkedList<>();
    private Integer duree=1;

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Integer getDuree() {
        return duree;
    }

    public Road getStreet() {
        return street;
    }

    public Queue<Car> getCarsQueue() {
        return carsQueue;
    }

    public boolean isGreen() {
        return green;
    }

    public boolean isRed(){
        return !green;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    public void setStreet(Road street) {
        this.street = street;
    }

    public void setCarsQueue(Queue<Car> carsQueue) {
        this.carsQueue = carsQueue;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "green=" + green +
                ", street=" + street +
                ", carsQueue=" + carsQueue +
                ", duree=" + duree +
                '}';
    }
}
