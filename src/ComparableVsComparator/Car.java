package ComparableVsComparator;

import java.util.Comparator;

public class Car implements Comparable<Car>{
    int speed;
    String name;
    int price;
    public  Car(String name, int price, int speed){
        this.name = name;
        this.price = price;
            this.speed = speed;


    }

    public  String toString(){
        return "["+this.name + " , "+ price + " , " + speed +"]\n";
    }

    @Override
    public int compareTo(Car o) {
        // Sort According to  speed wise
        return this.speed-o.speed;
    }
}


class CarPriceComparator implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return o1.price-o2.price;
    }
}

