package ArrayConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingOfArray {
    public static void main(String[] args) {
        int arr[] = new int[]{9,2,5,12,12,34};
        int k =3;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //O(N)logN
        int kthLargestNumber = arr[arr.length-k];
        System.out.println(kthLargestNumber);

    }
}
