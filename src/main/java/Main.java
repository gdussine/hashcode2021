import model.TrafficLightSchedule;
import services.CarServices;
import services.CrossServices;
import services.RoadServices;
import services.ScheduleServices;
import util.Input;
import util.Output;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathIn = "input/a.txt";
        String pathOut = "output/a.txt";

        Input in = new Input(pathIn);
        System.out.println(CrossServices.getInstance());
        System.out.println(CarServices.getInstance());
        System.out.println(RoadServices.getInstance());

        ScheduleServices s =in.getSimulation().run();

        Output out = new Output(pathOut, s.getTrafficLightSchedules());
    }
}
