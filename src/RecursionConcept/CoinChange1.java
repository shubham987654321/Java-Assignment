package RecursionConcept;

import java.util.Scanner;

/*
You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the combinations of the n coins (non-duplicate) using
     which the amount "amt" can be paid.



 Sample Input
5
2 3 5 6 7
12
Sample Output
2-3-7-.
5-7-.
 */
public class CoinChange1 {

    public static  void  coinChangWithoutDuplicate(int coins[], int amt, String str, int index){
        if(amt ==0){
            System.out.println(str);
            return;
        }
        if(amt<0){
            return;
        }
        if(index==coins.length){
            return;
        }
        coinChangWithoutDuplicate(coins,amt-coins[index],str+coins[index]+"-",index+1);
        coinChangWithoutDuplicate(coins,amt,str,index+1);
    }


        public static  void  coinChangWithDuplicate(int coins[], int amt, String str, int index){
        if(amt ==0){
            System.out.println(str);
            return;
        }
        if(amt<0){
            return;
        }
        if(index==coins.length){
            return;
        }
        if(amt>0){
            coinChangWithDuplicate(coins,amt-coins[index],str+coins[index]+"-",index);
        }
        coinChangWithDuplicate(coins,amt,str,index+1);
    }


    public static void main(String[] args) {

        int coins[] = {18,1,10};
        int amount = 20;
        coinChangWithoutDuplicate(coins,amount,"",0);
        System.out.printf("-------------------\n");
        coinChangWithDuplicate(coins,amount,"",0);


    }
}
