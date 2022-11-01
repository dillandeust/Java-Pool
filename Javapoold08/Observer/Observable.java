package Observer;

interface Observable {
    void addObserver(Observer observer);
    boolean notifyObservers();

}
