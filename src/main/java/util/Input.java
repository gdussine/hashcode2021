package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    public Input(String path) {
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
                Integer B = Integer.parseInt(arr[0]);//start
                Integer E = Integer.parseInt(arr[1]);//end
                String nom = arr[2];
                Integer L = Integer.parseInt(arr[3]);//len
            }

            for(int j=0 ; j<V ; j++){
                ligne = scanner.nextLine();
                arr =ligne.split(" ");
                Integer P = Integer.parseInt(arr[0]);//nb de street
                for(int k=0 ; k<P ; k++){
                    String currentRue = arr[k+1];//rue actuelle
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found" +path);
        }

    }

}
