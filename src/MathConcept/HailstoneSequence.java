package MathConcept;
import  java.util.*;

/*
* As a running example, we're going to explore the hailstone sequence,
* which is defined as follows. Starting with a number n,
*  the next number in the sequence is n/2 if n is even,
* or 3n+1 if n is odd. The sequence ends when it reaches 1. Here are some examples:

2, 1
3, 10, 5, 16, 8, 4, 2, 1
4, 2, 1
2n, 2n-1 , ... , 4, 2, 1
5, 16, 8, 4, 2, 1
7, 22, 11, 34, 17, 52, 26, 13, 40, ...? (where does this stop?)*/
public class HailstoneSequence {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int n;
         n = sc.nextInt();
         while(n!=1){
             if(n%2 ==0){
                 System.out.println(n);
                 n = n/2;
             }else{
                 System.out.println(n);
                 n=3*n+1;
             }

         }
         System.out.println(1);

    }
}
