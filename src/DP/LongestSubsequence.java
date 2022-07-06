package DP;

import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.Scanner;
// find longest common subsequence b.w two String
public class LongestSubsequence {
    private  static ArrayList<String> arrList = new ArrayList<>();
    private  static ArrayList<String> arrList2= new ArrayList<>();

    // Brute force method
    public static void   getAllSubsequnce(String str, String curr, int i){
        if(i==str.length()){
            System.out.println(curr);
            arrList.add(curr);
            return  ;
        }
        getAllSubsequnce(str,curr,i+1);
        getAllSubsequnce(str,curr+str.charAt(i),i+1);
    }


    // Recursive Solution
    public static int LCSByRecursive(String str1,String str2){
        if(str1.length()==0 || str2.length()==0){
            return  0;
        }
        char ch1=str1.charAt(0);
        char ch2=str2.charAt(0);
        String s1 = str1.substring(1);
        String s2 = str2.substring(1);
        if(ch1==ch2){
            return  1+ LCSByRecursive(s1,s2);
        }else{
            int o1 = LCSByRecursive(s1,str2);
            int o2 = LCSByRecursive(str1,s2);
            return Math.max(o1,o2);
        }
    }

    // Recursive Solution method
    public static int LCSRecursive2(String str1,String str2,int m , int n){
        if(m==0 || n==0){
            return 0;
        }

        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return  1+LCSRecursive2(str1,str2,m-1,n-1);
        }else{
            int o1 = LCSRecursive2(str1,str2,m-1,n);
            int o2 = LCSRecursive2(str1,str2,m,n-1);
            return  Math.max(o1,o2);
        }
    }



    // DP Solution
    public static int LCSByDP(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int result[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
            }
        }
        return  0;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "abc";
        String str2 ="k";
        //  getAllSubsequnce(str1,"",0);
        //  System.out.println(arrList);
        // Recursive Solution(1)
        // System.out.println("Longest Common Subsequence"+LCSByRecursive(str1,str2));
        // Recursive Solution(2)
        // System.out.println("Longest Common Subsequence " + LCSRecursive2(str1,str2,str1.length(),str2.length()));
        // Dynamic Solution
        System.out.println("LCS (DP Solution) " + LCSByDP(str1,str2));


    }
}
