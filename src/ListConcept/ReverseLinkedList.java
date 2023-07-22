package ListConcept;

public class ReverseLinkedList {

    public  static  LinkedList.Node reverseOfLinkedList(LinkedList.Node head){
        LinkedList.Node prev = null;
        LinkedList.Node curr = head;
        LinkedList.Node currhead = null;
        while (curr != null){
            currhead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currhead;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList.head = new LinkedList.Node(4);
        ll.head.next = new LinkedList.Node(5);
        ll.head.next.next = new LinkedList.Node(10);
        ll.head.next.next.next = new LinkedList.Node(14);

        LinkedList.printLinkedList(LinkedList.head);
        // Reverse of LinkedList
        LinkedList.Node reverseLL = reverseOfLinkedList(LinkedList.head);
        LinkedList.printLinkedList(reverseLL);

    }
}
