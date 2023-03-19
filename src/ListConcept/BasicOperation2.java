package ListConcept;

import java.util.ArrayList;
import java.util.List;

public class BasicOperation2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(3);

        l.add(0);
        l.add(1);
         System.out.println(l.get(1));
        l.set(1,l.get(1)+2);
         System.out.println(l.get(1));
        l.set(1,l.get(1)+2);

        System.out.println("-->"+l.get(1));
//        /System.out.println(l.get(2));
        System.out.println(l);
    }
}
