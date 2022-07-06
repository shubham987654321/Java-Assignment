package MathConcept;

import java.util.Scanner;

public class PrimeConcept {


    public  static void prime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }



    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n =sc.nextInt();
            //int count =0;
//            for(int div=1;div<=n;div++){
//              if(n%div ==0){
//                  count++;
//              }
//            }
//
//            if(count==2){
//                System.out.println("Prime");
//            }else{
//                System.out.println("Not Prime");
//            }

            prime(n);
        }
    }
}
