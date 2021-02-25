package services;

import model.Cross;
import model.TrafficLight;
import model.TrafficLightSchedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScheduleServices {
    private List<TrafficLightSchedule> tls = new ArrayList<TrafficLightSchedule>();

    public ScheduleServices() {
        for(Map.Entry<Integer, Cross> entry: CrossServices.getInstance().getCrossMap().entrySet()){
            tls.add(new TrafficLightSchedule(entry.getValue()));
        }
    }
}
