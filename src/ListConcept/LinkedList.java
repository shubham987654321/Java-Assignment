package ListConcept;

public  class LinkedList {
   static Node head;
   static class  Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static  void  printLinkedList(Node curr){

       while(curr != null){
           System.out.print(curr.data +" ");
           curr = curr.next;
       }
        System.out.println();
    }
}
