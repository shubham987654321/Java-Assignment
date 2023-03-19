package SetConcept;

import java.util.*;

/*
 Insert should be O(1)
 Deletion should be happened in O(1)

 */
public class RandomizedSet {

    private HashMap<Integer, Integer> s = new HashMap<>();
    private ArrayList<Integer> arr = new ArrayList<>();
    private static int index = 0;

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (s.containsKey(val)) {
            return false;
        }
        s.put(val, index);
        this.index += 1;
        arr.add(val);

        return true;
    }

    public boolean remove(int val) {
        if (s.containsKey(val)) {
            // remove from ArrayList
           Collections.swap(arr,s.get(val),arr.size()-1);
            arr.remove(arr.size() - 1);
            s.remove(val);
            index-=1;
            return true;
        }
        return false;
    }

    public int getRandom() {

        Random r = new Random();
        int l = arr.size();
        if (l > 0) {
            return arr.get(r.nextInt(arr.size()));
        }
        return 0;

    }


    public static void main(String[] args) {
        RandomizedSet r = new RandomizedSet();
//,"remove","remove","insert","getRandom","remove","insert"
//        System.out.println(r.insert(10));
//        System.out.println(r.insert(20));
//        System.out.println(r.insert(10));
//        System.out.println(r.getRandom());
         System.out.println(r.getRandom());
        System.out.println(r.remove(10));
         System.out.println(r.remove(20));
        System.out.println(r.insert(10));
        System.out.println(r.getRandom());
        System.out.println(r.remove(10));
        System.out.println(r.remove(10));


    }
}
