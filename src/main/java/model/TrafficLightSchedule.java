package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficLightSchedule {

    private Map<TrafficLight, Integer> schedule = new HashMap<TrafficLight, Integer>();

    public Map<TrafficLight, Integer> getSchedule() {
        return schedule;
    }
}
