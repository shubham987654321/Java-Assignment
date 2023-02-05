package RecursionConcept;

/*

     box 3 item 2
       ---
       1--                  -1-                  --1
       12- 1-2              21-, -12             2-1, -21
 */

public class Pnc1 {

    private static void printArray(int arr[]){
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
       }
       System.out.println();
    }


    /**
     * Total ways to arrange the r item in n boxes    if identical is different
     * @param boxes       : Number Of Boxes
     * @param ci
     * @param item         : Number Of Item
     */
    public  static  void permuteItemInTheBox(int boxes[], int ci, int item){
        if(ci>item){
            printArray(boxes);
            return;
        }
        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==0){
                boxes[i] = ci;
                permuteItemInTheBox(boxes,ci+1,item);
                boxes[i] =0;
            }
        }
    }




      public  static  void permuteItemInTheBoxForIdentical(int boxes[], int ci, int item, int index){
          if (item == 0) {
              printArray(boxes);
              return;
          }
          if(index>=boxes.length){
              return;
          }
        if(boxes[index] ==0){
                    boxes[index]=1;
        permuteItemInTheBoxForIdentical(boxes,ci,item-1,index+1);
        boxes[index]=0;
        permuteItemInTheBoxForIdentical(boxes,ci,item,index+1);
        }
    }





    public static void main(String[] args) {
        int boxes[] = new int[5];
        int item = 3;
        // 5p3 =10
//        permuteItemInTheBox(boxes,1,item);
        permuteItemInTheBoxForIdentical(boxes,1,item,0);

    }
}
