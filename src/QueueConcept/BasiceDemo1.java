package QueueConcept;

import java.util.ArrayDeque;

public class BasiceDemo1 {
    public static void main(String[] args) {
         ArrayDeque<Integer> que = new ArrayDeque<>();

         que.add(1);
         que.add(2);
         que.add(3);
         que.add(4);
         System.out.println(que);
         que.pop();
                  System.out.println(que);

    }

}
