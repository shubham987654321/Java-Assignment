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

class LexSort {
    //Function to return the lexicographically sorted power-set of the string.
//    static ArrayList<String> powerSet(String s)
//    {
//        // add your code here
//
//
//    }
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
        String str = "abc";
//        LexSort.powerSet(str,0,"",);
    }
}
