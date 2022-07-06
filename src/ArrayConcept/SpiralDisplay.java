package ArrayConcept;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String []args){

        Scanner  sc = new Scanner(System.in);
        Integer n;
        n = sc.nextInt();
        Integer m;
        m = sc.nextInt();
        Integer[][] A = new Integer[n][m];

        for(Integer i=0;i<n;i++){
            for(Integer j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }
        }


        // After Spiral
        System.out.println("Serial ");
        for(Integer j=0;j<m;j++){
            for(Integer i=j; i<n-j;i++){
                System.out.print(A[i][j] + " ");
            }
            for(Integer k=n-j-1; k<m-j;k++){
                if(j+1<m){
                    System.out.print(A[k][j+1] + " ");
                }

            }

            for(Integer l=n-j-2; l>=0;l--){
                System.out.print(A[l][m-j-1] + " ");
            }
//
//            for(Integer i=j; i>j;i++){
//                System.out.print(A[i][m-j-1]);
//            }

        }


    }
}
