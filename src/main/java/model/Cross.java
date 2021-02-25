package model;

import java.util.List;

public class Cross {

    int id;
    List<Road> roadsSrc;
    List<Road> roadDst;

    public int getId() {
        return id;
    }

    public List<Road> getRoadDst() {
        return roadDst;
    }

    public List<Road> getRoadsSrc() {
        return roadsSrc;
    }
}
