package DP;
/*
 Initally we are at the position 0th
        2,3,1,1,4
minJump   2, 1,  2  1, 0

           arr[i] = k;
           K to 1
           and take min of res[k] to res[1]

 */

import java.util.Arrays;

public class JumpGameII {

    public static int minJumpDP(int arr[], int n) {

        int res[] = new int[n];
        res[n-1]=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=1){
                int k= arr[i];
                int currMinJump = Integer.MAX_VALUE;
                while (k>=1){
                    if(i+k<n){
                         currMinJump = Math.min(res[i+k],currMinJump);
                    }
                    k--;
                }

                res[i] = (currMinJump<Integer.MAX_VALUE)?currMinJump+1 : Integer.MAX_VALUE;
            }else{
                res[i]=Integer.MAX_VALUE;
            }

        }

        System.out.println(Arrays.toString(res));

        return  res[0];

    }


    public static void main(String[] args) {
        int arr[] = new int[]{5,9,3,2,1,0,2,3,3,1,0,0};

        System.out.println(minJumpDP(arr,arr.length));


    }
}
