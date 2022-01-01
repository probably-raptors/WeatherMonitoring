package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance = null;

    public static WeatherMonitoringSystem theInstance() {
        if (null == instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
}
