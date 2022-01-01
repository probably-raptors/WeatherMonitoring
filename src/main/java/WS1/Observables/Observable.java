package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;

public class Observable {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(int data){
        for (Observer observer : this.observers) {
            observer.update(data);
        }
    }
}
