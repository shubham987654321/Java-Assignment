package DP;
/*
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
The test cases are generated so that the answer will be less than or equal to 2 * 109.


 Input: m = 3, n = 7
Output: 28

 */


class Solution {
    public int uniquePaths(int m, int n) {
        int res[][] = new int[m][n];
        for(int j=0;j<n;j++){
            res[m-1][j]=1;
        }

        for(int i=0;i<m;i++){
            res[i][n-1]=1;
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                res[i][j] = res[i+1][j]+res[i][j+1];
            }
        }
        return  res[0][0];

    }
}
public class UniquePaths {
    public static void main(String[] args) {
        Solution s = new Solution();
        int totalPossibelPath = s.uniquePaths(20, 1);
        System.out.println(totalPossibelPath);
    }
}
