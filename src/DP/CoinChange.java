package DP;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

//Minimum Coin to Change to a Current Ammount
public class CoinChange {
    // Total ways to change our coins of an Amount
    public static int totalPossibleWaysForAmount(int coins[], int amount, int i, int output[][]) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        if (coins.length == 0) {
            return 0;
        }
        if (i >= coins.length) {
            return 0;
        }
        if (output[amount][i] > -1) {
            return output[amount][i];
        }
        int first = totalPossibleWaysForAmount(coins, amount, i + 1, output);
        int second = totalPossibleWaysForAmount(coins, amount - coins[i], i, output);
        output[amount][i] = first + second;
        return first + second;

    }


    /**
     * Recurstive Solution
     *
     * @param coins
     * @param n
     * @param amount
     * @param countCoins
     * @param output
     * @return
     */
    private static int minimumCoinsForAmount(int coins[], int n, int amount, int countCoins, int[][] output) {
        if (amount == 0) {
            return countCoins;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if (n == 0) {
            return Integer.MAX_VALUE;
        }

        int ans = Math.min(minimumCoinsForAmount(coins, n - 1, amount, countCoins, output)
                , minimumCoinsForAmount(coins, n, amount - coins[n - 1], countCoins + 1, output));


        output[amount][n] = ans;
        return ans;

    }

    static int minimumCoinsForAmountDP(int coins[], int n, int amount) {
        int res[] = new int[amount + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            int minCoins = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (coins[j] <= i) {
                    if (res[i - coins[j]] < Integer.MAX_VALUE) {
                        minCoins = Math.min(minCoins, res[i - coins[j]]+1);
                    }
                }
            }
            res[i] = minCoins;
        }

        System.out.println(Arrays.toString(res));
        return res[amount];

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins[] = {25, 10, 5};


        int amount = 32;

        int output[][] = new int[amount + 1][coins.length + 1];
        Arrays.stream(output).forEach(a -> {
            Arrays.fill(a, -1);
        });

//       System.out.println(totalPossibleWaysForAmount(coins,amount,0,output));
//
//       for(int i=0;i<=amount;i++){
//             System.out.println(Arrays.toString(output[i]));
//       }

        // find how many minimum number of coins is sufficient for that amount

        int output2[][] = new int[amount + 1][coins.length + 1];
        Arrays.stream(output2).forEach(a -> {
            Arrays.fill(a, -1);
        });
//        long start = System.currentTimeMillis();
        System.out.println(minimumCoinsForAmount(coins, coins.length, amount, 0, output2));

        long end = System.currentTimeMillis();
//       System.out.println(end-start);


        // Time Check


//       for(int i=0;i<=amount;i++){
//             System.out.println(Arrays.toString(output2[i]));
//       }


//        Dp Solution

        System.out.println(minimumCoinsForAmountDP(coins, coins.length, amount));


    }
}
