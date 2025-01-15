public class Singelton implements Comparable<Singelton> {

   private static volatile Singelton obj = null;

   private static final Object lock = new Object();

   private Singelton() {
        System.out.println("instainated ");
   }

   public static Singelton createObj(){
       if(obj == null){
           synchronized (lock) {
               if(obj==null) {
                   obj = new Singelton();
                   System.out.println(obj.hashCode());
               }
           }
       }
       return obj;
   }

    @Override
    public int compareTo(Singelton o) {
//        return Integer.compare(this.hashCode(), o.hashCode());
        return 0;
   }
}
