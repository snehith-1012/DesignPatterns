package ObserverDesignPattern;

public class PaytmObserver implements Observer {

    @Override
    public void update(int x, int y) {
        System.out.println("seat booked at" + x + "th row and" + y + "th column in Paytm");
    }
}
