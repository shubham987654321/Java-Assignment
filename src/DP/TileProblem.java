package DP;

import java.util.Scanner;

/*

 */
public class TileProblem {


    /**
     * Given a wall has size 4*N and we have  tiles  of size 4*1
     * then find the total number of ways to arrange tiles on the wall
     * @param n : size of wall 4*n
     * @return :
     */
    static int arrangeTilesInWall(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 1;
        }
        if (n == 4) {
            return 2;
        }
        return arrangeTilesInWall(n - 1) + arrangeTilesInWall(n - 4);
    }


    /**
     * fill the 1*m size of tiles in the wall
     * @param n : number of row in wall
     * @param m : number of column in wall
     * @return : total no. of ways to arrange tiles in the wall
     */
//    static  int arrangeTilesOnWall(int n, int m){
//
//       return arrangeTilesInWall(n-1)+arrangeTilesOnWall(n+1-m,m);
//    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(arrangeTilesInWall(n));


    }
}
