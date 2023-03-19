package GreedyAlgorithms;


public class CoinAmount {

    static int minimumCoinsForAmount(int coins[], int amt, int i, int countcoins) {
        if (i >= coins.length) {
            return (int) Double.POSITIVE_INFINITY;
        }
        if (amt < 0) {
            return (int) Double.POSITIVE_INFINITY;
        }
        if(amt==0){
            return countcoins;
        }

        int s1 = minimumCoinsForAmount(coins, amt - coins[i], i, countcoins+1);
        int s2 = minimumCoinsForAmount(coins, amt, i + 1, countcoins);


        return (Math.min(s1, s2));


    }


    public static void main(String[] args) {
        int coins[] = {20,2,10};
        int amount=20;
        System.out.println(minimumCoinsForAmount(coins,amount,0,0));
    }
}
