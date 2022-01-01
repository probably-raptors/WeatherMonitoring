package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class LogPressObserver extends Log implements Observer{
    public LogPressObserver(WeatherMonitoringSystem ws) {
        super(ws);
    }

    @Override
    public void update(int data) {
        this.data = data;
    }

    public void displayPressure() {
        System.out.println("Log: pressure = " + this.data + "millibars");
    }
}
