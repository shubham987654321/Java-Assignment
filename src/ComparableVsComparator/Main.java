package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> carlist = new ArrayList<>();
        carlist.add(new Car("n1", 20, 100));
        carlist.add(new Car("n2", 100, 90));
        carlist.add(new Car("n3", 90, 130));
        carlist.add(new Car("n4", 200, 300));
        carlist.add(new Car("n5", 31, 50));


        // Sorting according to Speed of Cars
         Collections.sort(carlist);
        System.out.println(carlist);


        // Sorting according to Speed of Cars(Reversed Order)
         Collections.sort(carlist, Collections.reverseOrder());
        System.out.println(carlist);

        // Sorting according to price of Cars
        Collections.sort(carlist, new CarPriceComparator());
        System.out.println(carlist);


        // Sorting according to price of Cars(Reverse Order)
        Collections.sort(carlist, new CarPriceComparator().reversed());
        System.out.println(carlist);


    }
}
