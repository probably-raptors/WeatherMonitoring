package WS1.Nimbus1;

import WS1.Observables.Observable;
import WS1.Observables.Sensor;
import WS1.Observers.MonitoringScreen;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {

    public Random rnd;

    public Nimbus1TemperatureSensor(String type, int interval) {
        super(type, interval);
    }

    @Override
    public int read(){
        return rnd.nextInt(40);
    }
}
