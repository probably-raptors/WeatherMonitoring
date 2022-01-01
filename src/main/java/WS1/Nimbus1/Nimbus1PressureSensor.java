package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {

    public Random rnd;

    public Nimbus1PressureSensor(String type, int interval) {
        super(type, interval);
    }

    @Override
    public int read() {
        return rnd.nextInt(101) + 950;
    }
}
