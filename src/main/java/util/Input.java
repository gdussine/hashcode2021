package util;

import model.Cross;
import model.Road;
import model.Simulation;
import services.CarServices;
import services.CrossServices;
import services.RoadServices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Input {
    private Simulation simulation;

    public Simulation getSimulation() {
        return simulation;
    }

    public Input(String path) {


        CrossServices crossServices = new CrossServices();
        RoadServices roadServices = new RoadServices();
        CarServices carServices = new CarServices();

        try {
            File obj = new File(path);
            Scanner scanner = new Scanner(obj);
            String ligne = scanner.nextLine();
            String[] arr =ligne.split(" ");
            Integer D = Integer.parseInt(arr[0]);//duration
            Integer I = Integer.parseInt(arr[1]);//intersection
            Integer S = Integer.parseInt(arr[2]);//streets
            Integer V = Integer.parseInt(arr[3]);//cars
            Integer F = Integer.parseInt(arr[3]);//pt bonus

            for(int i =0 ; i<S ; i++){
                ligne = scanner.nextLine();
                arr =ligne.split(" ");

                String nom = arr[2];//name
                Road r= roadServices.getOrCreate(nom);

                Integer B = Integer.parseInt(arr[0]);//start
                Cross crossB = crossServices.getOrCreate(B);
                crossB.addRoadSrc(r);
                Integer E = Integer.parseInt(arr[1]);//end
                Cross crossE = crossServices.getOrCreate(E);
                crossE.addRoadDst(r);

                Integer L = Integer.parseInt(arr[3]);//len
                r.setLength(L);
            }

            for(int j=0 ; j<V ; j++){
                ligne = scanner.nextLine();
                arr =ligne.split(" ");
                LinkedList<Road> list = new LinkedList<Road>();

                Integer P = Integer.parseInt(arr[0]);//nb de street
                for(int k=0 ; k<P ; k++){
                    String currentRue = arr[k+1];//rue actuelle
                    Road r = roadServices.getOrCreate(currentRue);
                    list.add(r);
                }
                carServices.create(list);
            }
            simulation = new Simulation(F,D);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found" +path);
        }

    }

}
