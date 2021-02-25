package services;

import model.Road;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RoadServices {
    private static RoadServices instance;

    public static RoadServices getInstance() {
        if(instance==null)
            instance=new RoadServices();
        return instance;
    }
    private HashMap<String,Road> crossMap = new HashMap<String,Road>();

    private RoadServices(){

    }
    public Road getOrCreate(String id){
        Road result =crossMap.get(id);
        if(result!=null){
            return result;
        }
        result =new Road();
        result.setName(id);
        crossMap.put(id,result);
        return result;
    }

    @Override
    public String toString() {
        return "RoadServices{" +
                "crossMap=" + crossMap +
                '}';
    }
}
