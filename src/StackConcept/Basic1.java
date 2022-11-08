package StackConcept;

import java.util.ArrayDeque;
import java.util.Stack;

public class Basic1 {
    public static void main(String[] args) {
        //Stack<Integer> stack = new Stack<>();

        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        System.out.println("=="+s);
        System.out.println("==Peak"+s.peek());
        s.pop();
        System.out.println("=="+s);
        System.out.println("==Peak"+s.peek());
        s.push(40);
        System.out.println("=="+s);
    }
}
