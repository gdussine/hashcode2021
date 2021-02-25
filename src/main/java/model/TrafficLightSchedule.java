package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficLightSchedule {

    private Cross cross;
    private int total=0;
    //private Map<TrafficLight, Integer> schedule = new HashMap<TrafficLight, Integer>();
    private List<TrafficLight> schedule = new ArrayList<TrafficLight>();
    private int compteur=0;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public List<TrafficLight> getSchedule() {
        return schedule;
    }

    public TrafficLightSchedule(Cross cross) {
        this.cross = cross;

        for (Road r : cross.getRoadsSrc()){
            int currentDuree =1;
            schedule.add(r.getTrafficLight());
            this.total+=currentDuree;
        }

    }

    public void process(){
        compteur++;
        int index =compteur%total;
        int inDuree=0;
        while(index != index){


        }
    }

    public Cross getCross() {
        return cross;
    }
}
