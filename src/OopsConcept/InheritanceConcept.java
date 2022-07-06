package OopsConcept;

class vehicle{
    int  number_of_wheel;
    int  speed;

    void  getInfo(){
        System.out.println(" No. of Wheel : "+number_of_wheel +"  speed is "+speed);
    }

   public  vehicle(){
        System.out.println("Constructor vehicle is called");
    }

}

class  Toyto extends  vehicle{
    int  cost;

   public  void setCost(int cost){
       this.cost  = cost;

   }
    public  Toyto(){
        System.out.println("Constructor Toyto is called");
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        Toyto t = new Toyto();
        t.setCost(3000);
        t.getInfo();
        t.number_of_wheel=10;
        t.speed=250;
        t.getInfo();

    //    vehicle v = new vehicle();

    }

}
