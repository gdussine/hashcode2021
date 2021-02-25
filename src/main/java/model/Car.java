package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Car {

    private static int autoId = 0;
    private int id;
    private Queue<Road> roads = new LinkedList();
    private int time;

    public Car(Queue<Road> roads) {
        this.roads = roads;
        this.id = ++id;
        this.time = this.roads.peek().getLength();
    }

    public void forward(){
        if(time > 0){
            time--;
            return;
        }
        if(this.roads.peek().getTrafficLight().isRed()){
            return;
        }
        if(!this.roads.peek().getTrafficLight().getCarsQueue().peek().equals(this)){
            return;
        }
        roads.poll();
        this.time = this.roads.peek().getLength();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roads, time);
    }

    public Queue<Road> getRoads() {
        return roads;
    }

    public int getTime() {
        return time;
    }

}
