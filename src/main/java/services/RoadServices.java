package services;

import model.Road;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RoadServices {
    private HashMap<String,Road> crossMap = new HashMap<String,Road>();

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
}
