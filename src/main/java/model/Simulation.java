package model;

import services.CarServices;
import services.ScheduleServices;

public class Simulation {
    public static Boolean calcul = true;
    private Integer bonus, duree;

    public Integer getBonus() {
        return bonus;
    }

    public Integer getDuree() {
        return duree;
    }

    public Simulation(Integer bonus, Integer duree) {
        this.bonus = bonus;
        this.duree = duree;
    }

    public ScheduleServices run(){
        ScheduleServices s= new ScheduleServices();
        //System.out.println(s.getTrafficLightSchedules());
        for (int i=0; i< duree ; i++){
            s.process();
            CarServices.getInstance().forward();
        }
        return s;
    }
}
