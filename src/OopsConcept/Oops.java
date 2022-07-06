package OopsConcept;

 class Rectangle{
    Integer length;
    Integer height;

    Integer area(){
        return  length* height;
    }
}






public class Oops {
    public static void main(String[]  args){
        Rectangle r = new Rectangle();
        r.length = 10;
        r.height = 20;
        System.out.println("Area is "+r.area());

    }

}
