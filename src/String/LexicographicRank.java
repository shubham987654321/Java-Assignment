package String;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.HashSet;

public class LexicographicRank {

    /*
    STRING
    Rank of STRING
    all word which is lexicographically smaller than STRING +1
    S -> all char which is smaller than 'S' (Right Side of Char)
    ST -> all char which is smaller than 'T'
    --------
    STRG--
     */

    static final int  CHAR=256;

    // assume that character in string will be distinct
    @NotNull
    static  int[] storefrequency(String str ){
        int count[] = new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]=1;
        }

        return  count;


    }
    static void lexRange(String str){
       int count[] = storefrequency(str);
       // find the smaller number from  right side


    }

    public static void main(String[] args) {
        String str="STRING";
        lexRange(str);


    }
}
