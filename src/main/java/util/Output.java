package util;

import model.TrafficLight;
import model.TrafficLightSchedule;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Output {
    public Output(String path, TrafficLightSchedule schedule) throws IOException {
        PrintWriter writer = new PrintWriter(path, StandardCharsets.UTF_8);
        Map<TrafficLight, Integer> tl = schedule.getSchedule();
        writer.println();
        writer.println();
        writer.close();
    }
}
