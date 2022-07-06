package OopsConcept;

class Base{

    public  Base(){
        System.out.println("Base class Constuctor");
    }

    public  Base(int a){
        System.out.println("Base2 Super class Constuctor");
    }
    public  Base(int a, int b){
        System.out.println("Base2 Super2 class Constuctor");
    }
}

class Derived extends  Base{
    public  Derived(){
        super(10,20);
        System.out.println("Derived class Constuctor");
    }
}

public class InheritanceConstructor {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
