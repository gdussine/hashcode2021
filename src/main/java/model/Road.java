package model;

import java.util.LinkedList;
import java.util.Queue;

public class Road {

    private Cross src;
    private Cross dst;
    private int length;
    private String name;
    private TrafficLight trafficLight;
    private Queue<Car> carsQueue = new LinkedList<>();



    public String getName() {
        return name;
    }

    public Cross getSrc() {
        return src;
    }

    public Cross getDst() {
        return dst;
    }

    public int getLength() {
        return length;
    }

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    public Queue<Car> getCarsQueue() {
        return carsQueue;
    }
}
