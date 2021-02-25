package model;

import services.ScheduleServices;

public class Simulation {
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

    public void run(){
        ScheduleServices s= new ScheduleServices();
        for (int i=0; i< duree ; i++){

        }
    }
}
