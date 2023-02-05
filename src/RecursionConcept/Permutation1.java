package RecursionConcept;


import java.util.HashMap;
import java.util.HashSet;


public class Permutation1 {

    public static int  genrateAllPermutation(String str, HashMap<Character,Integer> currstrMap, String res, int i ){
        int totalPermutation=0;
        if(res.length()==str.length()){
            totalPermutation +=1;
            System.out.println(res);
            return 1;
        }
        if(i>=str.length()){
            return 0;
        }
        for(Character c : currstrMap.keySet()){
            if(currstrMap.get(c)>0){
                currstrMap.put(c,currstrMap.get(c)-1);
                genrateAllPermutation(str,currstrMap,res+c,i+1);
                currstrMap.put(c,currstrMap.get(c)+1);
                genrateAllPermutation(str,currstrMap,res,i+1);
            }
        }
        return  totalPermutation;
    }

    public static void main(String[] args) {
        String str ;
        str = "aba";  // ans will be !5/!3 = 4*5 = 20
        HashMap<Character,Integer> currStrMap  = new HashMap<>();
        for(Character c : str.toCharArray()){
          if(!currStrMap.containsKey(c)){
              currStrMap.put(c,0);
          }
          currStrMap.put(c,currStrMap.get(c)+1);
        }

        System.out.println( genrateAllPermutation(str,currStrMap,"",0));

    }
}
