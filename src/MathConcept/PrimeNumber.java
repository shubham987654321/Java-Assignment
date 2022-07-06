package MathConcept;

import java.util.Scanner;

public class PrimeNumber {

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
       int count =0;
       long start = System.currentTimeMillis();

        int low,high;
        low=sc.nextInt();
        high = sc.nextInt();

        for(int i=low;i<=high;i++){
            int sum=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    sum++;
                    break;
                }

            }
            if(sum==0){
                count++;
                System.out.println(i);
            }

        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);
        System.out.println("Total Prime NUmber  is : "+count);
    }
}
