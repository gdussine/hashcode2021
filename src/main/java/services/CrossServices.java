package services;

import model.Cross;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CrossServices {

    private static CrossServices instance;

    public static CrossServices getInstance() {
        if(instance==null)
            instance=new CrossServices();
        return instance;
    }

    private CrossServices(){

    }

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

    @Override
    public String toString() {
        return "CrossServices{" +
                "crossMap=" + crossMap +
                '}';
    }
}
