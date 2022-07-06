package WrapperConcept;

/**
 * The  Class that is use to convert the primitive data type in object and object
 * into primitive data type
 */
public class Basic {
    public static void main(String[] args) {
        Integer i=20;
        Integer j=20;
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(i.equals(j));


//        Wrapper Conversion
        Integer i2= new Integer(29);
        byte b = i2.byteValue();
        System.out.println(i2 + "  " + b );

//        parse  (return the primitve data type)
        double d = Double.parseDouble("3.23");
        System.out.println(d);
        System.out.println(d);







    }
}
