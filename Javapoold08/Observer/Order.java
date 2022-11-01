package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {

    private String position;
    private String destination;
    private int timeBeforeArrival;
    private List<Observer> observers = new ArrayList<Observer>();

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }

    public void setData(String position, String destination, int timeBeforeArrival) {
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = timeBeforeArrival;
        notifyObservers();
    }

    public boolean notifyObservers() {
        for (Observer index : observers)
            index.update(this);
        return false;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
        
    }
}
