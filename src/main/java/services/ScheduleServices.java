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

    public List<TrafficLight> getAll(){
        ArrayList<TrafficLight> res = new ArrayList<TrafficLight>();
        for( TrafficLightSchedule tfs : tls){
            res.addAll(tfs.getSchedule());
        }
        return res;
    }

    public void process(){
        for( TrafficLightSchedule tfs : tls){
            tfs.process();
        }
    }
}
