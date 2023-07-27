package ListConcept;

public class LeftShiftLinkedList {

    /*
            N = 5
        value[] = {2, 4, 7, 8, 9}
        k = 3
        Output: 8 9 2 4 7
        Explanation:
        Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
        Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
        Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
             */
    public  static LinkedList.Node rotate(LinkedList.Node head, int k) {
        // add code here
        LinkedList.Node currhead=head,tail=null;

        while(currhead.next != null){
            currhead = currhead.next;
        }
        tail = currhead;
        currhead = head;


        while (k > 0) {
            LinkedList.Node newHead = currhead.next!=null?currhead.next:currhead;
            tail.next=currhead;
            tail = currhead;
            currhead.next=null;
            currhead = newHead;
            k--;
        }
        return  currhead;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList.head = new LinkedList.Node(2);
        ll.head.next = new LinkedList.Node(1);
//        ll.head.next.next = new LinkedList.Node(3);
//        ll.head.next.next.next = new LinkedList.Node(14);
//        ll.head.next.next.next.next = new LinkedList.Node(24);
        LinkedList.printLinkedList(LinkedList.head);
        LinkedList.printLinkedList(rotate(LinkedList.head,1));
    }

}
