package Codechef;

import java.util.HashMap;
import java.util.Scanner;

/*
Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
 */


public class FruitIntoBaskets {
    class Solution {
        public int totalFruit(int[] fruits) {
            int ans = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            int k = -1;
            for (int i = 0; i < fruits.length; i++) {

                map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);

                System.out.println("map " + map.toString());
                while (k<i && map.size() > 2) {
                    k++;
                    map.remove(fruits[k]);
                }

                ans = Math.max(ans, i - k);
                System.out.println("ans " + ans);

            }
            return ans;
        }
    }


    public static void main(String[] args) {
        FruitIntoBaskets f = new FruitIntoBaskets();
        Solution s = f.new Solution();
        int fruits[] = new int[]{3,3,3,1,2,1,1,2,3,3,4};

        int ans = s.totalFruit(fruits);
        System.out.println(ans);
    }
}
