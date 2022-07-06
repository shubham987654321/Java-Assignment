package OopsConcept;
/*


*/


class  Cylinder{
    private  int radius;
    private  int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}



public class InheritanceConept1 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(2);
        myCylinder.setRadius(2);
        System.out.println("Surface Area" + myCylinder.surfaceArea());



    }
}
