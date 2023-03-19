package Codechef;

import java.util.*;

/*
3
5 2 11
4 3 24
7 7 100
 */
public class ToDivideOrNotToDivide {
    /**
     * @param a
     * @param b
     * @param n
     * @return
     */
    // 1≤A,B,N≤10^9
    static int smallestNumberLikedByBoth(int a, int b, int n) {
        if(a==b || b==1){
            return  -1;
        }
        if(a==1){
            return n%b==0?n+1:n;
        }
        if (n % a == 0 &&  n%b != 0) {
            return n;
        } else {
           return smallestNumberLikedByBoth(a, b, n + 1);
        }

    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int T;
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        while (T>=0){
            int a,b,n;
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int res =smallestNumberLikedByBoth(a,b,n);
            System.out.println(res);
            T--;
        }

    }
}
