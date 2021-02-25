package model;

import java.util.LinkedList;
import java.util.Queue;

public class Road {

    private int id;
    private Cross src;
    private Cross dst;
    private int length;
    private String name;
    private TrafficLight trafficLight;


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

    public void setId(int id) {
        this.id = id;
    }

    public void setSrc(Cross src) {
        this.src = src;
    }

    public void setDst(Cross dst) {
        this.dst = dst;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
}
