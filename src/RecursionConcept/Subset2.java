package RecursionConcept;
import  java.util.*;
/*
Given an integer array nums that may contain duplicates, return all possible
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
Given an integer array nums that may contain duplicates, return all possible
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
[1,2,2]
1 , (1,2), (1,2,2),(2,2), (2)
1->1
2-->2
 */
public class Subset2 {

      public static void  subsetsWithDup(int[] arr, List<List<Integer>> lal , List<Integer> list, int p) {
          if(p>=arr.length){
              return;
          }

          lal.add(new ArrayList<>(list));

          for(int i=p;i<arr.length;i++){
              if(i > p && arr[i] == arr[i-1]){
                  continue;
              }
              list.add(arr[i]);
              subsetsWithDup(arr,lal,list,i+1);
              list.remove(arr[i]);
          }




    }


    public static void main(String[] args) {

         int arr[] =new  int[]{1,2,4,2};
        Arrays.sort(arr);

        List<List<Integer>> laList = new ArrayList<>();
        List<Integer> alist = new ArrayList<>();
        subsetsWithDup(arr,laList,alist,0);

        for(List l : laList.subList(0,laList.size())){
            System.out.println(l.toString());
        }


    }


}
