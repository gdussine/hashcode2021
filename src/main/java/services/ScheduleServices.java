package services;

import model.Cross;
import model.TrafficLight;
import model.TrafficLightSchedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScheduleServices {
    private final List<TrafficLightSchedule> trafficLightSchedules = new ArrayList<TrafficLightSchedule>();

    public ScheduleServices() {
        for(Map.Entry<Integer, Cross> entry: CrossServices.getInstance().getCrossMap().entrySet()){
            trafficLightSchedules.add(new TrafficLightSchedule(entry.getValue()));
        }
    }

    public void process(){
        for( TrafficLightSchedule tfs : trafficLightSchedules){
            tfs.process();
        }
    }

    public List<TrafficLightSchedule> getTrafficLightSchedules() {
        return trafficLightSchedules;
    }
}
