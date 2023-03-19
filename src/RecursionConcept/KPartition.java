package RecursionConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class KPartition {

    static boolean resFlag = false;

    public static void kpartionsolution(int[] arr, int k, int n, int vidx, ArrayList<ArrayList<Integer>> alist, int ssf, int[] subset) {
        if (vidx == n) {
            if (ssf == k) {

                for (int i = 0; i < k; i++) {

                    System.out.println(alist.get(i));
                }

                boolean flag = true;
                System.out.println("@@@@@@@@@@@" + Arrays.toString(subset));
                for (int i = 0; i < k - 1; i++) {
                    System.out.println(subset[i] + " " + subset[i + 1]);
                    if (subset[i] != subset[i + 1]) {
                        flag = false;
                        break;
                    }
                }
                System.out.println(flag);
                if (flag) {
                    resFlag = flag;
                }

                return;
            }
        }
        for (int i = 0; i < n; i++) {
            if (alist.get(i).size() > 0) {
                if (vidx < n) {
                    alist.get(i).add(arr[vidx]);
                    subset[i] += arr[vidx];
                    kpartionsolution(arr, k, n, vidx + 1, alist, ssf, subset);
                    alist.get(i).remove(alist.get(i).size() - 1);
                    subset[i] -= arr[vidx];
                }


            } else {
                if (vidx < n) {
                    alist.get(i).add(arr[vidx]);
                    subset[i] += arr[vidx];
                    kpartionsolution(arr, k, n, vidx + 1, alist, ssf + 1, subset);
                    alist.get(i).remove(alist.get(i).size() - 1);
                    subset[i] -= arr[vidx];
                    break;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5};
        int k = 2;

        ArrayList<ArrayList<Integer>> alist = new ArrayList<>();
        for (int i = 0; i <= arr.length; i++) {
            alist.add(new ArrayList<>());
        }

        int[] subset = new int[arr.length];

        kpartionsolution(arr, k, arr.length, 0, alist, 0, subset);

        System.out.println(resFlag);

//        kpartionsolution2(1, k, arr.length, 0, alist, 0);


    }
}
