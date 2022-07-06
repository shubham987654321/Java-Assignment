package HashMapConcept;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    public  static   void main(String []args){
        HashMap<String,Integer> hm  =  new HashMap<String, Integer>();
        hm.put("India",200);
        hm.put("China",100);
        hm.put("USA",20);
        System.out.println(hm);
        hm.put("India",20);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Pak"));
//        contains key
        System.out.println(hm.containsKey("Pak"));
        System.out.println(hm.keySet());

        Set<String> keySet = hm.keySet();
        for (String key: keySet
             ) {
            System.out.println(key +":"+hm.get(key));

        }
    }
}
