package BSTConcept;

public class CustomBST {
    int value;
    CustomBST left;
    CustomBST right;
    public CustomBST(int value, CustomBST left ,CustomBST right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // add method
    public static CustomBST add(CustomBST node, int data){
        if(node == null){
            return  new CustomBST(data, null,null);
        }
        if(data>node.value){
            node.right = add(node.right,data);
        }else{
            node.left = add(node.left,data);
        }

        return null;
    }


    // remove method
}
