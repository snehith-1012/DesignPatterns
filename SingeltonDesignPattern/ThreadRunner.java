package SingeltonDesignPattern;

import SingeltonDesignPattern.Singelton;

import java.util.Set;

public class ThreadRunner implements Runnable{

    private Set<Singelton> set = null;
    public ThreadRunner(Set<Singelton> s){
        this.set = s;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            Singelton obj = Singelton.createObj();
            this.set.add(obj);
        }
    }
}
