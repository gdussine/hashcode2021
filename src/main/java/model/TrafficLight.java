package model;

public class TrafficLight {

    // 0 = red, 1 = green
    private boolean green = false;
    private Road street;

    public Road getStreet() {
        return street;
    }

    public boolean isGreen() {
        return green;
    }
}
