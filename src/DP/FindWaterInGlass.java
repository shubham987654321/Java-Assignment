package DP;

import java.util.*;

public class FindWaterInGlass {
    private static double solution(int k, int r, int c) {

        double dp[][] = new double[r+2][];
        int res = 0;
        for (int i = 0; i <=r+1; i++) {
            dp[i] = new double[i + 1];
        }
        dp[0][0] = k;
        for (int i = 0; i <=r+1; i++) {
            for (int j = 0; j < dp[i].length; j++) {

                if (dp[i][j] > 1.0 && i+1<=r+1) {
                        double totalWater =  dp[i][j]-1.0;
                        dp[i][j] = 1;
                        dp[i + 1][j] += totalWater / 2.0;
                        dp[i + 1][j + 1] += totalWater  / 2.0;
                    }


            }
        }


        for(int i=0;i<=r;i++){
            System.out.println(i+ "  ==> "+Arrays.toString(dp[i]));
        }
        return dp[r][c];

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(solution(k, r, c));
    }


}
