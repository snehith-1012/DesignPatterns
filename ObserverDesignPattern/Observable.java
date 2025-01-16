package ObserverDesignPattern;


public interface Observable {


    void registerObserver(ObserverDesignPattern.Observer observer);

    void unregisterObserver(ObserverDesignPattern.Observer observer);

    void notifyAllObservers(int x,int y);
}
