package WS1.Observers;

import WS1.Nimbus1.Trend;
import WS1.Observables.PressureTrendSensor;
import WS1.Observables.WeatherMonitoringSystem;

public class LogPressTrendObserver extends Log implements Observer {
    public LogPressTrendObserver(WeatherMonitoringSystem ws) {
        super(ws);
    }

    @Override
    public void update(int data) {
        this.data = data;
    }

    public Trend calcPressureTrend(PressureTrendSensor pst) {
        if (pst.lastReading1 < pst.lastReading2 && pst.lastReading2 < pst.lastReading3) {
            return Trend.RISING;
        } else if (pst.lastReading1 > pst.lastReading2 && pst.lastReading2 > pst.lastReading3) {
            return Trend.FALLING;
        } else {
            return Trend.STABLE;
        }
    }

    public void displayPressureTrend(int data) {
        PressureTrendSensor pst = null;
        System.out.println("Log: pressure trend = " + calcPressureTrend(pst));
    }
}