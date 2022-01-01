package WS1.Observables;

import WS1.Nimbus1.Trend;
import WS1.Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer {

    public int lastReading1, lastReading2, lastReading3;
    public Trend pressureState;
    public Trend lastState;

    public Trend calc() {
        return null;
    }

    public void check() {

    }

    public void update(int data) {
        
    }
}
