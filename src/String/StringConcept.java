package String;

import java.util.Scanner;
/*

In array "length" is data member but in String length is method
arr.length
but in String
str.length()
 */

public class StringConcept {

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
//        String s2 = sc.next();
//        System.out.println(s1);
//        System.out.println(s2);

        System.out.println(s1.length());
        System.out.println(s1.charAt(12));
    }
}
