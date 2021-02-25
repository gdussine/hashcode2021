package util;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Output {
    public Output(String path) throws IOException {
        PrintWriter writer = new PrintWriter(path, StandardCharsets.UTF_8);
        writer.println();
        writer.println();
        writer.close();
    }
}
