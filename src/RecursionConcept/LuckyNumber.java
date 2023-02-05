package RecursionConcept;

import java.util.Scanner;

/*
Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
Take the set of integers
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.
------------
Input:
N = 5
Output: 0
Explanation: 5 is not a lucky number
as it gets deleted in the second
iteration.
--------------
Input:
N = 19
Output: 1
Explanation: 19 is a lucky numbers
 */
public class LuckyNumber {
    static int count = 2;

    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        if(n%count==0){
            return false;
        }
        if(n<count){
            return true;
        }

        n = n-n/count;
        count++;
        return isLucky(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println("Is Lucky :"+isLucky(n) );

    }
}
