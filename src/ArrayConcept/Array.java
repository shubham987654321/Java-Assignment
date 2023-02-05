package ArrayConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public  static  void main(String  []args){
/*
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(20);
        System.out.println(arrList.size());

*/
        System.out.println("Enter number of rows and Columns");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m;
        m = sc.nextInt();

       int A[][] = new int[n][m];
       System.out.println("Enter element in ArrayConcept.Array ");
       for(Integer i=0;i<n;i++) {
           for (int j = 0; j < m; j++) {
               int temp = sc.nextInt();
               A[i][j] = temp;
           }
       }

       System.out.println("ArrayConcept.Array");
       for(Integer i=0;i<n;i++){
           for(Integer j=0;j<m;j++){
               System.out.print(A[i][j]+ "  ");
           }
           System.out.println();
       }



    }
}
