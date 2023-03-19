package DP;
import  java.util.*;
public class Tringle {

    public int minCostToTopToBottom(List<List<Integer>> tringle){
        int n = tringle.size();
        int [][]dp = new int[n][];
        for(int j=0;j<tringle.get(n-1).size();j++){
            dp[n-1][j] = tringle.get(j).get(j);
        }

        for(int row=n-2;row>=0;row--){
            for(int col=0;col<tringle.get(row).size();col++){
                int first_path = dp[row][col]+dp[row+1][col+1];
                int second_path = dp[row][col] + dp[row][col+1];
                dp[row][col] = Math.min(first_path,second_path);
            }
        }
        return dp[0][0];
    }



    public static void main(String[] args) {
//       List<List<Integer>> tringle =  new ArrayList<>(){} [[2],[3,4],[6,5,7],[4,1,8,3]];

    }
}
