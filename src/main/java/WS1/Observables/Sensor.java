package WS1.Observables;

public class Sensor {
    public int lastReading;
    public int interval;
    public String type;

    public Sensor(String type, int interval){
        this.type = type;
        this.interval = interval;
    }

    public int read(){
        return 0;
    }

    public void check(){

    }
}
