package OopsConcept;

interface  Bicycle{
    void applyBreak(int decreament);
    void speedUp(int increament);
}

class  AvonCycle implements  Bicycle{
    public void applyBreak(int decreament){
     System.out.println("Applying Break "+decreament);
    }
    public void  speedUp(int increament){
        System.out.println("Applying Speed "+increament);
    }

}



public class InterfaceConcept {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.speedUp(10);
    }
}
