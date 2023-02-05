package SetConcept;

import java.util.HashMap;
import java.util.HashSet;

/*
Set
--> Sorted,   : TreeSet
Unsorted  : HashSet, Linked HasSet

Not Indexed

Set = HashSet, Linked HashSet, TreeSet


HashSet                  vs                 LinkedHashSet

1. Doesn't have order                    Preserves the orders
Default size is 16


LinkedHas Set ===============
Internally it is doubly linked list.



 */
public class BasicOperation {
    public static void main(String[] args) {
        Integer x = new Integer(10000);
        System.out.println(x.hashCode());
        HashSet<Integer>  s1= new HashSet<>();
        s1.add(1);

       System.out.println(s1.add(4));


    }
}
