package StackConcept;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balenced_Parenthesis {

    private static   Boolean matching(char a,char b){
        return  (a=='(' && b==')') ||
                (a=='{' && b=='}' )||
                (a=='[' && b==']');


    }

    // check our parenthesis is balanced or not
    public  static boolean check_Parenthesis(String str){

        Deque<Character> s = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            System.out.println("Stack is "+s);
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            }else{
                if(s.isEmpty()==false){
                    return  true;
                }else if(matching(s.peek(),x) ==false){
                    System.out.println("Stack is "+s);
                    return  false;
                }else{
                    s.pop();
                }
            }
        }
        return  s.isEmpty();
    }

    public static void main(String[] args) {
        String str="(])";
        System.out.println("Check Parenthesis : "+check_Parenthesis(str));
    }
}
