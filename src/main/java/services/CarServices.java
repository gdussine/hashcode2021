package services;

import model.Car;
import model.Road;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CarServices {


    List<Car> cars = new ArrayList<Car>();

    public CarServices(){

    }


    public void forward(){
        for(Car car : cars){
            car.forward();
            if(car.getRoads().isEmpty()){
                cars.remove(car);
            }
        }
    }

    public void create(Queue<Road> r){
        cars.add(new Car(r));
    }

}
