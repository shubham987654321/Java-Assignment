package DP;

import java.util.ArrayDeque;
import java.util.Deque;

public class Longest_Valid_Parentheses {

    private  static  boolean isParenthesisCorrect(char a , char b){
                 return true;
    }

    public static int  getLongest_valid_parenthesesLength(String str){
        Deque<Character>  s = new ArrayDeque<Character>();
        int totalValidParenthesis = 0;
        int n = str.length();
        int dp[] =new int[n];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                dp[i]=0;
                s.push(ch);
            }else {
                if(s.isEmpty()){
                    continue;
                }
                if(isParenthesisCorrect(s.peek(), ch)){
                    totalValidParenthesis+=2;
                    dp[i] = 2;
                    s.pop();
                }
            }
            dp[i] = totalValidParenthesis;
        }
        return totalValidParenthesis;
    }

    public static void main(String[] args) {
          //         0 2 0 0 2
        String str ="()(())";
        System.out.println(getLongest_valid_parenthesesLength(str));
    }
}
