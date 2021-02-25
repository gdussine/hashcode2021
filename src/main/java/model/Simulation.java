package model;

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
}
