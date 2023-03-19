package OopsConcept;

 class Singleton{
     int x;
        private  Singleton(){
            System.out.println("singleton called");
        }

        private  static final Singleton INSTANCE = new Singleton();
        public static Singleton getInstance(){
            return  INSTANCE;
        }

     public void setX(int x) {
         this.x = x;
     }

     public int getX() {
         return x;
     }
 }

public class BasicSingleton {



    public static void main(String[] args) {
        // we can't create instace of class Sigleton
//       Singleton s = new Singleton();

        Singleton s =  Singleton.getInstance();
        System.out.println(s.getX());
        s.setX(34);
        System.out.println(s.getX());
                Singleton s2 =  Singleton.getInstance();




    }
}
