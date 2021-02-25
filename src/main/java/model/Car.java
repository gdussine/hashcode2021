package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Car {

    private Queue<Road> roads = new LinkedList<>();

    public Car(Queue<Road> roads) {
        this.roads = roads;
    }

    public Queue<Road> getRoads() {
        return roads;
    }

    public void setRoads(Queue<Road> roads) {
        this.roads = roads;
    }
}
