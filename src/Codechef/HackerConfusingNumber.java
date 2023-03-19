package Codechef;

import java.util.Arrays;

public class HackerConfusingNumber {
    static boolean checkContainsInValidNumber(char[] ch) {
        int i = 0;
        while (i < ch.length) {

            if ((ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '5' || ch[i] == '7' || ch[i] == '8')) {
                return false;
            }
            i++;
        }

        return true;
    }

    static int findValidNumber(int n) {
        int count=0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            if (checkContainsInValidNumber(str.toCharArray())) {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1000000000;
        int arr[] = new int[]{2,5,3,12,102};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(findValidNumber(n));

    }
}
