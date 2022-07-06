package ArrayConcept;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class ArrayListConcept {
    // size can decrease or increase
    /*public  static  void main(String[] args){
        ArrayList<Integer>  arrList = new ArrayList<>();
        System.out.println(arrList.size());
        arrList.add(10);
        arrList.add(20);
        arrList.add(40);

        // get first index value
        System.out.println(arrList.get(1));

        // to remove
        arrList.remove(1);

        System.out.println(arrList);
        for ( int val:arrList
             ) {

            System.out.println(val);

        }
    }*/


//stack
  /*  public  static  void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st);

        // top value
        System.out.println(st.peek());

        // to remove use pop()


    }
*/


    // Queue
    public  static  void main(String[] args) {
        ArrayDeque<Integer>  que = new ArrayDeque<>();
        que.addLast(10);
        que.addLast(20);
        System.out.println(que);

        System.out.println(que);


        // que.removeFirst();



    }
}

