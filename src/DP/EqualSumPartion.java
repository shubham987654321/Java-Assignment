package DP;


import java.io.*;
import java.util.*;

class EqualSumPartion {
    public static void main(String[] args) throws IOException {

        //reading input using BufferedReader class
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            //reading size of array
            int n = Integer.parseInt(br.readLine().trim());

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];

            //inserting elements in the array
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            //creating an object of class Solution
            SolutionPartition ob = new SolutionPartition();

            //calling findPartition() method and
            //printing "YES", if it returns true
            //else "NO"
            if (ob.findPartition(a, n) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class SolutionPartition {

    //Function to check whether a set of numbers can be partitioned into
    //two subsets such that the sum of elements in both subsets is same.
    public boolean findPartition(int[] a, int n) {
        int k = 2;

        int[] subset = new int[k];

        ArrayList<ArrayList<Integer>> allsubset = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            allsubset.add(new ArrayList<>());
        }

        return solution(a, allsubset, 0, k, n, subset, 0);

    }

    private boolean solution(int[] a, ArrayList<ArrayList<Integer>> allsubset, int ssf, int k, int n, int[] subset, int vidx) {

        if(vidx==n){
            if(ssf==k){
                 boolean flag=true;
               for(int i=0;i<subset.length-1;i++){
                   System.out.println("--"+ Arrays.toString(subset));
                   if(subset[i]!=subset[i+1]){
                       flag = false;
                       break;
                   }

               }
                if(flag){
                       System.out.println("a@@@@@@@" + allsubset.get(vidx));
                   }
               return  flag;
            }

        }

        for (int i = 0; i < n; i++) {
            if (allsubset.get(i).size() > 0) {
                allsubset.get(i).add(a[vidx]);
                subset[i] += a[i];
                  solution(a, allsubset, ssf, k, n, subset, vidx + 1);
                allsubset.get(i).add(a[vidx]);
                subset[i] -= a[i];
                allsubset.get(i).remove(allsubset.get(i).size() - 1);


            } else {
                allsubset.get(i).add(a[vidx]);
                subset[i] += a[i];
                solution(a, allsubset, ssf+1, k, n, subset, vidx + 1);
                allsubset.get(i).add(a[vidx]);
                subset[i] -= a[i];
                allsubset.get(i).remove(allsubset.get(i).size() - 1);
            }
        }
        return  true;

    }
}

