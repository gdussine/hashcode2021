package util;

import model.Cross;
import model.TrafficLight;
import model.TrafficLightSchedule;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Output {
    public Output(String path, List<TrafficLightSchedule> schedules) throws IOException {
        PrintWriter writer = new PrintWriter(path, StandardCharsets.UTF_8);
        writer.println(schedules.size()); // number of intersections
        for (TrafficLightSchedule schedule : schedules) {
            writer.println(schedule.getCross().getId()); // cross id
            StringBuilder stb = new StringBuilder();
            writer.println(schedule.getSchedule().size()); // number of monitored traffic lights
            for (TrafficLight tl : schedule.getSchedule()) {
                writer.println(tl.getStreet().getName()+" "+tl.getDuree()); // a simple traffic light and its duration
            }
        }
        writer.close();
    }
}
