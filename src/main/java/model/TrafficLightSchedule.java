package model;

import services.CarServices;

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
        int totalModulee =compteur%total;
        int index=0;
        int incDuree=schedule.get(index).getDuree();

        while(incDuree <= totalModulee){
            index++;
            incDuree+= schedule.get(index).getDuree();

        }
        for( int  i=0 ; i<schedule.size() ; i++){
            if( i!= index){
                schedule.get(i).setGreen(false);
            }
            else{
                schedule.get(i).setGreen(true);
            }
        }

    }
}
