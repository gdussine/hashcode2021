package services;

import model.Car;

import java.util.List;

public class CarServices {


    List<Car> cars;

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

}
