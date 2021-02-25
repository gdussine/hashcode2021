package services;

import model.Car;
import model.Road;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CarServices {
    private static CarServices instance;

    public static CarServices getInstance() {
        if(instance==null)
        instance=new CarServices();
        return instance;
    }

    List<Car> cars = new ArrayList<Car>();

    private CarServices(){

    }


    public void forward(){
        for( int i=0; i< cars.size() ;i++){
            Car car = cars. get(i);
            car.forward();
            if(car.getRoads().isEmpty()){
                cars.remove(car);
            }
        }
    }

    public void create(Queue<Road> r){
        cars.add(new Car(r));
    }

    @Override
    public String toString() {
        return "CarServices{" +
                "cars=" + cars +
                '}';
    }
}
