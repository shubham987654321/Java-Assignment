package QueueConcept;

import java.util.PriorityQueue;
import  java.util.*;
/*
  I/p 10,8,7,11
  pq : 10,8,7,
         11>7 remove peek and add element otherwise leave it.
 */

public class PriorityQueueConcept {

    // find k largest element



    public static void  kLargestElements(int arr[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            if(pq.size()<k ){
                  pq.add(arr[i]);
            }else if(pq.peek()<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }

       Iterator it =  pq.iterator();
        while(it.hasNext() ){
            System.out.println(it.next());

        }



    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,4,5,6,7,12};
        int k = 2;
        kLargestElements(arr, k);

    }
}
