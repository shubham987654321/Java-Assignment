package MathConcept;

import java.util.Scanner;

public class PerfectNumber {

    public static  boolean  checkPerfect(int n){
        int sum=0;
        for(int i=1;i*i<n;i++){
            if(n%i==0){
                int temp = n/i;
                if(temp<n && temp != i){
                    sum +=i+temp;
                }else{
                    sum +=i;
                }
            }
        }
        System.out.println(sum+ " "+n);
        if(sum == n)return  true;
        return  false;
    }
    public static void main(String[] args){
      int n;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      System.out.println(checkPerfect(n));

    }
}
