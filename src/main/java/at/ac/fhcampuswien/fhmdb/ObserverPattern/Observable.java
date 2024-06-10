package at.ac.fhcampuswien.fhmdb.ObserverPattern;

public interface Observable {
    void setObserver(Observer observer);
    void notifyObserver(boolean success);
}
