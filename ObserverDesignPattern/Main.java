package ObserverDesignPattern;

import SingeltonDesignPattern.ThreadRunner;

import java.util.HashSet;

public class Main {

    public static void main(String[] args){
        Theatre theatre = new Theatre();
        ObserverDesignPattern.BookMyShowObserver bms = new ObserverDesignPattern.BookMyShowObserver();
        ObserverDesignPattern.PaytmObserver paytm = new ObserverDesignPattern.PaytmObserver();
        theatre.registerObserver(bms);
        theatre.registerObserver(paytm);
        Thread th = new Thread(theatre);
        th.start();
    }
}
