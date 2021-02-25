package services;

import model.Cross;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CrossServices {
    private HashMap<Integer,Cross> crossMap = new HashMap<Integer,Cross>();

    public Cross getOrCreate(Integer id){
        Cross result =crossMap.get(id);
        if(result!=null){
            return result;
        }
        result =new Cross();
        result.setId(id);
        crossMap.put(id,result);
        return result;
    }
}
