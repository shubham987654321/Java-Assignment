package MathConcept;



import javafx.util.Pair;

import java.util.Scanner;
import  java.util.*;
/*
  1/a+1/b = 1/n
  find all pair of(a,b) satisfy the equation

  a+b/ab = 1/n
  na+nb-ab = 0
  na+nb-ab+n^2=n^2
  (a-n)(n-b)=n^2
   x * y = k
    all divisor of k will  be pair of x and y
    like divisor of k = c
     then divisor will also be -c
    a-n = x
              a = x+n
              or
              a-n = -x
              a = n-x
    n-b = y
            b = n-y
            or
            n-b = -y
            b = n+y
    so for positive x and y
     (a,b) = (x+n,n-y)
     for -ve x and y
     (a,b)  = (n-x,n+y)


     a can't be zero
     and n can't be zero
     we have to find all Integer value of a and b
 */
public class fraction1 {

    public static void main(String[] args) {
       int n;
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(solveEquation(n));
    }

    public  static  ArrayList<Pair<Integer,Integer>> solveEquation(int n){
        // find all divisor of  n^2

        ArrayList<Pair<Integer,Integer>> result_pair = new ArrayList<>();
        int number = n*n;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                // for positive number
                int  x=i;
                int y = number/i;
                if(n-y==0 || n+y==0){
                    continue;
                }
                result_pair.add(new Pair<>(x+n,n-y));
                // for negative number
                x = -x;
                y = -y;
                result_pair.add(new Pair<>(n-x,n+y));
            }
        }

        return   result_pair;
    }
}
