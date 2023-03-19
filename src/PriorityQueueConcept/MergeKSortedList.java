package PriorityQueueConcept;

import java.io.*;
import java.util.*;

public class MergeKSortedList {

    static class Pair implements Comparable {
        int data;
        int li;  // list of index
        int di;  //  data of index


        @Override
        public int compareTo(Object o) {
            return data - ((Pair) o).data;
        }
    }


    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> arrlist) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < arrlist.size(); i++) {
            Pair p = new Pair();
            p.data = arrlist.get(i).get(0);
            p.li = i;
            p.di = 0;
            pq.add(p);

        }

        while (pq.size() > 0) {
            Pair p = pq.peek();
            pq.remove();
            ans.add(p.data);

            p.di++;
            if (arrlist.get(p.li).size() > p.di) {
                p.data = arrlist.get(p.li).get(p.di);
                pq.add(p);
            }

        }


        return ans;

    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for (int val : mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
