package model;

import java.util.List;
import java.util.Objects;

public class Cross {

    int id;
    List<Road> roadsSrc;
    List<Road> roadDst;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addRoadSrc(Road r){
        roadsSrc.add(r);
    }

    public void addRoadDst(Road r){
        roadDst.add(r);
    }
    public List<Road> getRoadDst() {
        return roadDst;
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
