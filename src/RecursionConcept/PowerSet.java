package RecursionConcept;

/*
ou are given a string. You need to print the lexicographically sorted power-set of the string.
Note: The string s contains lowercase letter of alphabet.
Input:
s = abc
Output: a ab abc ac b bc c
Explanation: empty string,
a, ab, abc, ac, b, bc, c
are the sets.
 */


import java.util.ArrayList;
import java.util.Collections;

class LexSort {
    static  ArrayList<String> slist  = new ArrayList<>();
      static ArrayList<String> powerSetLex(String s, int i, String curr) {

        slist.add(curr);
        for (int j = i; j < s.length(); j++) {
            powerSetLex(s, j + 1, curr + s.charAt(j));
        }
        return slist;

    }
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        return powerSetLex(s, 0, "");

    }
    static void powerSet(String s, int i, String curr, ArrayList<String> lstr) {
        if (i >= s.length()) {
            lstr.add(curr);
            System.out.println(curr);
            return;
        }

        powerSet(s, i + 1, curr + s.charAt(i), lstr);
        powerSet(s, i + 1, curr, lstr);

    }




}

public class PowerSet {
    public static void main(String[] args) {
        String str = "acb";
//      LexSort.powerSet(str,0,"",new ArrayList<>());
      ArrayList<String> slist = LexSort.powerSet(str);
      Collections.sort(slist);
      for(String s : slist){
          System.out.print(s +" ");
      }



    }
}
