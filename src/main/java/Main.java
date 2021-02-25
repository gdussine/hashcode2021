import services.CarServices;
import services.CrossServices;
import services.RoadServices;
import util.Input;
import util.Output;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new File("a").getAbsolutePath());
        String pathIn = "input/a.txt";
        Input in = new Input(pathIn);
        System.out.println(CrossServices.getInstance());
        System.out.println(CarServices.getInstance());
        System.out.println(RoadServices.getInstance());
        //String pathOut = "../input/a.txt";

        int simulationDuration = 1;
        for (int i=0; i<simulationDuration; i++) {
            System.out.println("Coucou");
        }
        //Output out = new Output(, null);
    }
}
