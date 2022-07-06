package PriorityQueueConcept;
import java.io.*;
import java.util.*;

public class PriorityQueueBasic {
    public  static  void main(String[] args){
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // higher value get higher priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());



        int ranks[] = {1,35,12,12,10,10};

        for(int val :ranks){
            pq.add(val);
        }


        System.out.println(pq);
       while (pq.size()>0){
           System.out.println(pq.peek());
           pq.remove();
       }

    }
}
