package RecursionConcept;

import java.util.Arrays;
import java.util.Scanner;

/*
 Count the subset of given array whose sum equal to give number

 */
public class SubsetSum1 {
    public static void main(String[] args) {
        int n=3;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
        int arr[] = new int[]{10, 20, 15};
        int sum=25;
        System.out.println("array is "+ Arrays.toString(arr));

        System.out.println(countTotalSubsetForSum(arr,sum,0,""));

    }

    static  int count=0;
    public static int countTotalSubsetForSum(int arr[] , int  sum,int i,String str) {
        if(i>=arr.length){
            if(sum==0){
             count=count+1;
            }

            return  0;
        }
        if(sum<0){
            return  0;
        }


        if(sum>0){
            // count the ith element in sum
          countTotalSubsetForSum(arr,sum-arr[i],i+1,str+arr[i]);
          // do not count ith element in the sum
          countTotalSubsetForSum(arr,sum,i+1,str);
        }

        return  count;
    }
}
