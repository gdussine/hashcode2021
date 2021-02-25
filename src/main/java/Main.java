import util.Input;
import util.Output;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        assert args.length == 2;
        Input in = new Input(args[0]);
        int simulationDuration = 1;
        for (int i=0; i<simulationDuration; i++) {
            System.out.println("Coucou");
        }
        Output out = new Output(args[1]);
    }
}
