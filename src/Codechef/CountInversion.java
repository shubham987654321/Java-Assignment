package Codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountInversion {




    static int count = 0;



    public static int[] merge(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low == high) {
            int x[] = new int[1];
            x[0] = arr[low];
            return x;
        }


        int left[] = merge(arr, low, mid);
        int right[] = merge(arr, mid + 1, high);

        int merged[] = megefun(left, right,0);
        return merged;
    }

   static ArrayList<Integer> anslist = new ArrayList<>();
    static  int ans[]  ;
    private static int[] megefun(int[] left, int[] right, int low) {
        int i = 0, j = 0, k = 0;
        int res[] = new int[left.length + right.length];

        System.out.println("low "+low);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                res[k] = left[i];
                i++;
                k++;

            } else if (right[j] < left[i]) {
                count += (left.length - i);
                System.out.println("=="+ (left.length-i));
                anslist.add(left.length - i);
                for(int p=0;p<left.length-i;p++){
                    ans[low+i+p] +=1;
                }

                res[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < left.length) {
            res[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            res[k] = right[j];
            k++;
            j++;
        }

        System.out.println("ans : "+ Arrays.toString(ans));
        System.out.println("############################" );
        return res;
    }


    /*
     Time complexity : O(nlogn)
     Space Complexity : O(n)
     */
    public static int[] countiversion2(int arr[]) {
        return merge(arr, 0, arr.length - 1);


    }

    /*
         Time complexity : O(n*n)
         */
    public static int countiversion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {  // O(n)
            for (int j = i + 1; j < arr.length; j++) { // O(n)
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
//        System.out.println(count);
        return count;
    }


    public static int[] countOfSmallerNumbersAfterSelf(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high) {
            int x[] = new int[1];
            x[0] = arr[low];
            return x;
        }


        int right[] = countOfSmallerNumbersAfterSelf(arr, mid+1, high);
        int left[] = countOfSmallerNumbersAfterSelf(arr, low, mid);

        int merged[] = megefun(left, right, low);
        return merged;
    }

    public static void main(String[] args) {
//        int arr[] = new int[]{2, 4, 1, 3, 5};

//        System.out.println(countiversion(arr));
//        countiversion2(arr);
//        System.out.println(Arrays.toString(countiversion2(arr)));
//        System.out.println("count " + count);

        int arr3[] = new int[]{2, 4, 1, 3, 5};

         ans = new  int[arr3.length];
         count=0;
        System.out.println(Arrays.toString(countOfSmallerNumbersAfterSelf(arr3, 0, arr3.length -1)));
        System.out.println("count " + count);
        System.out.println("ans "+anslist);
         Collections.reverse(Arrays.asList(ans));
         System.out.println(Arrays.toString(ans));
    }
}
