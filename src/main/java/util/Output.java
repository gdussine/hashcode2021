package util;

import model.Cross;
import model.TrafficLight;
import model.TrafficLightSchedule;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Output {
    public Output(String path, TrafficLightSchedule schedule) throws IOException {
        PrintWriter writer = new PrintWriter(path, StandardCharsets.UTF_8);
        List<TrafficLight> tls = schedule.getSchedule();
        Set<Cross> crosses = new HashSet<>();
        for (TrafficLight tl : tls) {
            crosses.add(tl.getStreet().getSrc());
        }
        writer.println(crosses.size()); // number of intersections
        for (Cross cross : crosses) {
            writer.println(cross.getId()); // cross id
            StringBuilder stb = new StringBuilder();
            int inRoads = 0;
            for (TrafficLight tl : tls) {
                if (tl.getStreet().getSrc() == cross) {
                    stb.append(tl.getStreet().getName()).append(" ").append(tl.getDuree()).append('\n');
                    inRoads++;
                }
            }
            writer.println(inRoads); // number of roads in
            writer.print(stb.toString()); // all traffic lights
        }
        writer.close();
    }
}
