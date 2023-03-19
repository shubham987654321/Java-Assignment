package ArrayConcept;
import  java.util.*;


public class MinIndex {
    public  static int minIndex(int n, int arr[]){
        // Code Here.
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        int index=0;
        int maxcount = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            int count=0;
            for(int j=2;j<=5;j++){
                if(s.contains(j*arr[i])){
                    count++;
                }
            }
            if(count>maxcount){
                index=i;
                maxcount=count;
            }

        }

        return  index;
    }


    public static void main(String[] args) {
        int arr [] = new int[]{18 ,20, 7 ,3 ,14 ,20, 5};
        System.out.println(minIndex(arr.length, arr));
    }
}
