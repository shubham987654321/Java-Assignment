package DP;

/*
Leetcode :
Given an integer n,
return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
 */
public class CountOFBSTTree {

    public  static int countBST(int n){
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){

            int innercount=i-1;
            int outercount =0;
            while(innercount>=0){
                dp[i] +=dp[innercount]*dp[outercount];
                innercount--;
                outercount++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=19;
        System.out.println(countBST(n));

    }
}
