package DP;
import  java.util.*;

/*
 egg = e
 floor = f                 i / j
 e/g  =  kth floor    s--> e/k+1
                      fail--> e-1/k-1
 */

public class EggDrop {


    public static int eggDrop(int n, int k) {

		//n=number of eggs, k = number of floor
		int [][]res = new int[n+1][k+1];
		// if number of floor is 0;
		for(int i=0;i<=n;i++){
			res[i][0]=0;
		}


		// if number of egg is 1;
		for(int j=1;j<=k;j++){
			res[1][j]=j;
		}


		for(int i=1;i<=n;i++){
			for(int j=2;j<=k;j++){
				int min = Integer.MAX_VALUE;
				for(int p=j-1, q=0;p>=0;p--,q++){
					int max = Math.max(res[i][p], res[i-1][q]);
					min = Math.min(min,max);
				}

				res[i][j]=min+1;

			}
		}


        return res[n][k];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //n -> number of eggs and k -> number of floors
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(eggDrop(n, k));
    }
}
