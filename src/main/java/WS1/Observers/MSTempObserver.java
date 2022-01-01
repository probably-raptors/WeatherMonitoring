package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class MSTempObserver extends MonitoringScreen implements Observer {
    public int data;

    public MSTempObserver(WeatherMonitoringSystem ws) {
        super(ws);
    }

    @Override
    public void update(int data) {
        this.data = data;
    }
}
