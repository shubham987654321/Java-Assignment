package OopsConcept;


class MyEmployee{
    private  int id;
    private  String name;

    public  void setName(String n){
        name= n;
    }

    public  void setId(int i){
        id=i;
    }

    public  int getId(){
        return  id;
    }
    public  String getName(){
        return  name;
    }

}


public class AccessModifiers {

    public static void main(String[] args) {
        MyEmployee em = new MyEmployee();
        em.setId(123);
        em.setName("Shubham");
        System.out.println(em.getName());

    }
}
