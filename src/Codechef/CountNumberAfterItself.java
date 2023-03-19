package Codechef;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Vector;
import java.util.*;

public class CountNumberAfterItself {


    static int ans[];
    static List<Integer> anslist;
    static int count = 0;

    public static Vector<Pair<Integer, Integer>> mergeSort(Vector<Pair<Integer, Integer>> left, Vector<Pair<Integer, Integer>> right) {

        Vector<Pair<Integer, Integer>> res = new Vector<>();
        int i = 0;
        int j = 0;


        while (i < left.size() && j < right.size()) {
            Pair<Integer, Integer> p;
            if (left.get(i).getValue() <= right.get(j).getValue()) {

                p = new Pair<>(left.get(i).getKey(), left.get(i).getValue());
                res.add(p);
                i++;
            } else if (left.get(i).getValue() > right.get(j).getValue()) {
                p = new Pair<>(right.get(j).getKey(), right.get(j).getValue());
                count += (left.size() - i);

                for (int k = 0; k < left.size() - i; k++) {

                    ans[left.get(i + k).getKey()] += 1;

                    anslist.set(left.get(i + k).getKey(),anslist.get(left.get(i + k).getKey()) + 1);
                }

                res.add(p);
                j++;
            }
        }

        while (i < left.size()) {
            Pair<Integer, Integer> p;
            p = new Pair<>(left.get(i).getKey(), left.get(i).getValue());
            res.add(p);
            i++;
        }

        while (j < right.size()) {
            Pair<Integer, Integer> p;
            p = new Pair<>(right.get(j).getKey(), right.get(j).getValue());
            res.add(p);
            j++;
        }


        return res;

    }

    public static Vector<Pair<Integer, Integer>> merge(Vector<Pair<Integer, Integer>> v, int low, int high) {
        int mid = (low + high) / 2;
        if (low == high) {
            Vector<Pair<Integer, Integer>> ans = new Vector<>();
            Pair<Integer, Integer> p = new Pair<>(v.get(low).getKey(), v.get(low).getValue());
            ans.add(p);
            return ans;
        }

        Vector<Pair<Integer, Integer>> right = merge(v, mid + 1, high);
        Vector<Pair<Integer, Integer>> left = merge(v, low, mid);

        Vector<Pair<Integer, Integer>> res = mergeSort(left, right);
        return res;
    }

    public static void countNumberOfArray(int arr[]) {
        Vector<Pair<Integer, Integer>> v = new Vector<>();

        for (int i = 0; i < arr.length; i++) {
            Pair<Integer, Integer> p = new Pair<>(i, arr[i]);
            v.add(p);
        }


        merge(v, 0, arr.length - 1);


    }


    public static void main(String[] args) {
     int[] arr = new int[]{2,4,5,2,31,23};

        ans = new int[arr.length];
        anslist = new ArrayList<>(ans.length);
        for (int i = 0; i <arr.length; i++) {
            anslist.add(0);
        }

        countNumberOfArray(arr);

        System.out.println(Arrays.toString(ans));

        System.out.println(anslist);
    }

}
