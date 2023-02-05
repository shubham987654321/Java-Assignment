package RecursionConcept;

/*
1. You are given a string and a pattern.
2. You've to check if the string is of the same structure as pattern without using any regular
     expressions.

Note -> Check out the question video and write the recursive code as it is intended without
               changing signature. The judge can't force you but intends you to teach a concept.

               Input :
               graphtreesgraph
               pep

               Output :
               p -> graph, e -> trees, .

 */

import java.util.HashMap;

public class PatternMatching {

    public static  void  soultion(String str, String pattern, HashMap<Character,String> m){

        if(pattern.length()==0){
            if(str.length()==0){
              for(Character c  : m.keySet()){
                  System.out.println(c+"-->"+m.get(c));
              }

            }
            return;

        }
        Character ch = pattern.charAt(0);


        if(m.containsKey(ch)){
            String getPreviousData = m.get(ch);
            if(str.length()>=getPreviousData.length()){
                String leftPart = str.substring(0,getPreviousData.length());
                String rightPart = str.substring(getPreviousData.length());
                 String updatedPattern = pattern.substring(1);
                if(getPreviousData.equals(leftPart)){
                    soultion(rightPart,updatedPattern,m);
                }

            }

        }else{
            for(int i=0;i<str.length();i++){
                String leftPart = str.substring(0,i+1);
                String rightPart = str.substring(i+1);
                String updatedPattern = pattern.substring(1);
                m.put(ch,leftPart);
                soultion(rightPart,updatedPattern,m);
                m.remove(ch);
            }
        }
    }

    public static void main(String[] args) {
        String str = "malymalama";
        String pattern="xyxx";
        HashMap<Character,String> m = new HashMap<>();
        soultion(str,pattern,m);
    }
}
