package DP;

public class Knapsak01 {

    public static void main(String[] args) {
        int []wt = {1,3,5,6};
        int []price= {2,4,5,6};
        int cap=7;

        int wt1[] = new int[1000];
        int price1[]= new int[1000];

        for(int i=0;i<1000;i++){
            wt1[i] = i+1;
            price1[i] = i+1;
        }
        cap=80;

        long start = System.currentTimeMillis();
        System.out.println(knapsackRecursion(wt1,price1,0,cap));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        // DP SOlution
        long start1 = System.currentTimeMillis();
        System.out.println(kanpsackTP(wt1,price1,0,cap));
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);


    }

    public static int knapsackRecursion(int[] wt, int[] price, int videx, int cap){
        if(videx==wt.length){
            return 0;
        }
        if(cap==0){
            return 0;
        }
        // exclude
        int e = knapsackRecursion(wt,price,videx+1,cap);


        // include
        int i=0;
        if(cap>=wt[videx]){
             i = knapsackRecursion(wt,price,videx+1,cap-wt[videx]) +price[videx];
        }
        int ans  = Math.max(e,i);

       return  ans;
    }


    public static int kanpsackTP(int[] wt, int[] price, int videx, int cap) {
        if (videx == wt.length) {
            return 0;
        }
        if (cap == 0) {
            return 0;
        }
        // exclude
        int e = knapsackRecursion(wt, price, videx + 1, cap);


        // include
        int i = 0;
        if (cap >= wt[videx]) {
            i = knapsackRecursion(wt, price, videx + 1, cap - wt[videx]) + price[videx];
        }
        int ans = Math.max(e, i);

        return ans;
    }

    public static  int knapsackBU(int []wt, int []price, int vidx, int cap){
        int [][]output = new int[wt.length+1][cap+1];

        for(int row= wt.length-1;row>=0;row--){
            for(int col=1;col<=cap;col++){
                // exclude
                int e = output[row][col];

                // include
                int i=0;
                if(col>=wt[row]){
                     i = output[row][col-wt[row]] + price[row];

                }
                output[row][col] = Math.max(e,i);
            }
        }

        return  output[vidx][wt.length];

    }
}
