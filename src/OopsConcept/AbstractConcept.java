package OopsConcept;

abstract  class Parent{
    public Parent(){
        System.out.println("Base 2 ka Constructor");
    }

    public  void sayHello(){
        System.out.println("Hello and Handsome");
    }


   abstract public  void  greet();

}

class Child  extends  Parent{
    public  void greet(){
        System.out.println("Greet Abstraction");
    }

}

public class AbstractConcept {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();

    }
}
