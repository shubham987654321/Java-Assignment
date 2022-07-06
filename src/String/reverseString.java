package String;

import java.time.Year;
import java.util.Scanner;

public class reverseString {


    public  static  void reverse(StringBuilder str, Integer left , Integer right){
        int left1=left, right1=right;
        while(left<=right){
            char temp = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(left,temp);
            left--;
            right++;
        }
        System.out.println("After reverse the String is : "+str.substring(left1,right1));



    }



    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str = new StringBuilder(sc.nextLine());

        Integer left = 0;
        int n = str.length();
        for(Integer i=0;i<str.length();i++){
            if(str.charAt(i)== ' ')
            reverse(str,left, i-1);
            left =i+1;
        }
        reverse(str,left, n-1);

        System.out.println("After reverse the String is : "+str);
    }
}
