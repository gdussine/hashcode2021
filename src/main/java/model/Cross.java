package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cross {

    int id;
    List<Road> roadsSrc = new ArrayList<Road>();
    List<Road> roadsDst = new ArrayList<Road>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addRoadSrc(Road r){
        roadsSrc.add(r);
    }

    public void addRoadsDst(Road r){
        roadsDst.add(r);
    }
    public List<Road> getRoadsDst() {
        return roadsDst;
    }

    public List<Road> getRoadsSrc() {
        return roadsSrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cross cross = (Cross) o;
        return id == cross.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
