package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Theatre implements Observable, Runnable{

    Theatre(){

    }

    List<ObserverDesignPattern.Observer> observerList = new ArrayList<>();
    List<List<Integer>> seats = new ArrayList<>();
    Random random = new Random();
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                row.add(0);
            }
            seats.add(row);
        }
        while(true) {
            int x = random.nextInt(9);
            int y = random.nextInt(9);
            if (seats.get(x).get(y) == 0) {
                seats.get(x).set(y, 1);
                notifyAllObservers(x,y);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers(int x, int y) {
        this.observerList.stream().forEach(observer -> observer.update(x,y));
    }
}
