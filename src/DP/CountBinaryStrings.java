package DP;

import java.util.Arrays;
import java.util.Scanner;

/*
1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.

3  total Possible 2^3 =8
111
010
011
101
110
 output : 5

 */
public class CountBinaryStrings {
    static  int  numberOfBinaryString(int n){
        int []res1 = new int[n+1];
        int res2[] = new int[n+1];
        res1[0] =0;
        res1[0]=0;
        res1 [1] =1;
        res2[1] =1;

        for(int i=2;i<n+1;i++){
            res1[i] =res1[i-1]+res2[i-1];
            res2[i] = res1[i-1];
            }
        System.out.println(Arrays.toString(res1));
                System.out.println(Arrays.toString(res2));

        return  res1[n]+res2[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfBinaryString(n));
    }
}
