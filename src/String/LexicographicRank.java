package String;



import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/*
You are given a string S of lowercase characters,
find the rank of the string amongst its permutations when sorted lexicographically.
 */

public class LexicographicRank {

    /*
         STRING
    Rank of STRING
    all word which is lexicographically smaller than STRING +1
    S : Samller than 'S' : RING
    R ----- =  4*fact(5)
    I
    N
    G
    Smaller than  S'T' :  RING
     ST----  : 4*fact(4)
    Smaller than ST'R': ING
    STR--- : 3*fact(3)
    Smaller than STR'I' : G
    STRI-- : 1*fact(2)
    Smaller than STRI'N' : G
    STRIN- : 1*fact(1)


     */

    static final int  CHAR=256;

    // assume that character in string will be distinct

    static  int[] storefrequency(String str ){
        int count[] = new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]=1;
        }
        return  count;
    }

    static  int[] factorial(int n){
        int[] fact = new int[n];
        fact[0]=1;

        for(int i=1;i<n;i++){
            fact[i] = fact[i-1]*i;
        }

        return  fact;
    }
    static void lexRange(String str){
       int count[] = storefrequency(str);
       // find factorial of  number n
        int fact[] = factorial(str.length());
       // find the smaller number from  right side
        HashMap<Character , Integer> charCountSmallerThanMap= new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            int currcount=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)>str.charAt(j)){
                    currcount++;
                }
            }
            charCountSmallerThanMap.put(str.charAt(i),currcount);
        }
        System.out.println(charCountSmallerThanMap);

        int res=0;
        for(int i=0;i<str.length();i++){
            res +=charCountSmallerThanMap.get(str.charAt(i))*fact[str.length()-i-1];
        }

        System.out.println(res+1);


    }

    public static void main(String[] args) {
        String str="bc";
        lexRange(str);


    }
}
