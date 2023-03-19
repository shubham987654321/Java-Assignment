package ArrayConcept;

public class NiceArray {


    public static int niceSubarray(int arr[], int n) {
        int res =0;
        int count =0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==1 && !flag) {
                count = count+1;
                flag = true;
            }else if(arr[i] == count+1){
                count = count+1;
            }
            else{
                res = Math.max(res,count);
                count =0;
                flag = false;

            }
        }

        res = Math.max(res,count);
        return  res;

    }

    public static void main(String[] args) {

        int arr[] = new int[]{3,5,2,6};
        System.out.println(niceSubarray(arr,arr.length));
    }
}
