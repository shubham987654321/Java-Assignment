package DP;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

//Minimum Coin to Change to a Current Ammount
public class CoinChange {
    // Total ways to change our coins of an Amount
    public  static  int  totalPossibleWaysForAmount(int coins[],  int amount, int i, int output[][]){
        if(amount==0){
            return  1;
        }
        if (amount < 0) {
            return 0;
        }
        if(coins.length==0){
            return 0;
        }
        if(i>=coins.length){
            return 0;
        }
        if(output[amount][i]>-1){
            return  output[amount][i];
        }
        int first = totalPossibleWaysForAmount(coins,amount,i+1,output);
        int second = totalPossibleWaysForAmount(coins,amount-coins[i],i,output);
        output[amount][i] = first+second;
        return  first+second;

    }


    private  static  int minimumCoinsForAmount(int coins[], int n, int amount, int countCoins, int [][]output ){
        if(amount==0){
            return countCoins;
        }
        if(amount<0){
            return  (int)Double.POSITIVE_INFINITY;
        }
        if(n==0){
            return (int)Double.POSITIVE_INFINITY ;
        }

        int ans =    Math.min(minimumCoinsForAmount(coins,n-1,amount,countCoins,output)
                            ,minimumCoinsForAmount(coins, n, amount-coins[n-1],countCoins+1,output));


        output[amount][n] = ans;
        return  ans;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins[] = {1,3,5,10} ;



       int  amount = 7;

       int output[][] = new int[amount+1][coins.length+1];
        Arrays.stream(output).forEach(a->{
            Arrays.fill(a,-1);
        });

//       System.out.println(totalPossibleWaysForAmount(coins,amount,0,output));
//
//       for(int i=0;i<=amount;i++){
//             System.out.println(Arrays.toString(output[i]));
//       }

        // find how many minimum number of coins is sufficient for that amount

       int output2[][] = new int[amount+1][coins.length+1];
        Arrays.stream(output2).forEach(a->{
            Arrays.fill(a,-1);
        });
        long start = System.currentTimeMillis();
       System.out.println(minimumCoinsForAmount(coins,coins.length,amount,0,output2));
       long end = System.currentTimeMillis();
       System.out.println(end-start);


       // Time Check


       for(int i=0;i<=amount;i++){
             System.out.println(Arrays.toString(output2[i]));
       }





    }
}
