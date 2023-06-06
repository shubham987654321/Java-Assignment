package ArrayConcept;

import java.util.*;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> llist = new ArrayList<>();
        List<Integer> l;
        int j, k;
        int target = 0;
        int sum;


        for (int i = 0; i < nums.length; i++) {

            j = i + 1;
            k = nums.length - 1;
            sum = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) continue;


            while (j < k && j + 1 < nums.length) {
                int currsum = nums[j] + nums[k];
                int takedesion = (sum + currsum);


                if (takedesion < 0) {
                    j++;
                } else if (takedesion > 0) {
                    k--;
                } else if (takedesion == target) {



                    llist.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));

                    j++;
                    k--;
                    while(j<k && nums[j-1]==nums[j]){
                        j++;

                    }
                    while (j<k && nums[k]==nums[k+1]){
                        continue;
                    }
                }



            }
        }

        return llist;

    }

    public static void main(String[] args) {
        int arr[] = new int[]{0,0,0};
        List<List<Integer>> anslist = threeSum(arr);
        for (List<Integer> l : anslist
        ) {

            System.out.println(l);

        }
    }
}
