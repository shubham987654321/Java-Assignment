package DP;

import java.util.*;

/*
5 6
0 1 0 1 0 1
1 0 1 0 1 0
0 1 1 1 1 0
0 0 1 1 1 0
1 1 1 1 1 1

output : 2
 */

public class Largest_SubSquare_Matrix {
    public static int solution(int[][] arr) {
        //write your code here

        int ans = 0;
        int res[][] = new int[arr.length][arr[0].length];

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] == 0) {
                    res[i][j] = 0;
                }
            }
        }


        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = 0;
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] == 1) {
                    if (i + 1 < arr.length && j + 1 < arr[i].length) {
                        int a = res[i + 1][j];
                        int b = res[i][j + 1];
                        int c = res[i + 1][j + 1];

                        curr = Math.min(a, Math.min(b, c));
                        res[i][j] = curr + 1;
                    } else {
                        res[i][j] = 1;
                    }

                    ans = Math.max(ans, res[i][j]);

                } else {
                    res[i][j] = 0;
                }

            }
        }

        System.out.println(Arrays.deepToString(res));
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
}
