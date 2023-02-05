package RecursionConcept;
/*

100
001
x = 0
100%10


-------------------


123
321

x = 0
123,  o =1,2,3
123/10 = 12
9,9,9,9,9,9,9], l2 = [9,9,9,9]
9999999
+  9999
--------------
      10009998
      89990001
 */

import java.util.Scanner;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */





public class AdditionOfNumber {
    /*

     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2=0;
        while(l1 != null){
            num1 =num1*10+ l1.val;
            l1=l1.next;
        }
        System.out.println(num1);
        while(l2 != null){
            num2 =num2*10+ l2.val;
            l2=l2.next;
        }
         System.out.println(num2);

        int rnum1 = reverse(num1);
        int rnum2 = reverse(num2);


        int sum2=rnum1+rnum2;
        System.out.println("sum"+sum2);
        int x = sum2%10;
        sum2 = sum2/10;
        ListNode l = new ListNode(x);
        ListNode head  = l;
        ListNode tail = l;
        while(sum2>0){
           head.next = new ListNode(sum2%10);
           sum2 = sum2/10;
           head = head.next;

        }

        return tail;

    }

     */

    public static  int reverse(int num){
    int sum = 0;
    while(num>0){
        int x = num%10;
        sum = sum*10+x;
        num = num/10;
    }

    return  sum;
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int p = sc.nextInt();
        System.out.printf("reverse" +reverse(p));
    }






}
