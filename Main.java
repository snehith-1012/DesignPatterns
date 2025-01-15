import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Set<Singelton> set = Collections.synchronizedSet(new TreeSet<>());
        List<Thread> threads =  new ArrayList<>();
        for(int i=0;i<100;i++){
            Thread t1 = new Thread(new ThreadRunner(set));
            threads.add(t1);
        }

        for(int i=0;i<100;i++){
            threads.get(i).start();
        }

        for(int i=0;i<100;i++){
            threads.get(i).join();
        }

        System.out.println(set.size());
    }

}
