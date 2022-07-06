package DP;
import java.util.*;

public class basic1 {
    // get all  subsequence of a string
    public static  void  getSubsequence(String str, String curr, int i){
        ArrayList<String> allSubs = new ArrayList<>();
        if(i==str.length()){
            System.out.println("--->"+curr);
            return ;

        }
        getSubsequence(str,curr,i+1);
        getSubsequence(str,curr+str.charAt(i),i+1);

    }
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       getSubsequence(str,"",0);


    }


}

