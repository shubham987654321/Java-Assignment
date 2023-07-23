package ListConcept;

public class SortLinkedList {

    public static LinkedList.Node sortLinkedList(LinkedList.Node head) {
        if (head.next == null || head == null) {
            return head;
        }

        LinkedList.Node mid = findMidOfLinkedList(head);
        LinkedList.Node currMiddleNode = mid.next;
        mid.next = null;
        LinkedList.Node left = sortLinkedList(head);
        LinkedList.Node right = sortLinkedList(currMiddleNode);
        LinkedList.Node result = mergeSort(left, right);

        return result;

    }

    private static LinkedList.Node mergeSort(LinkedList.Node left, LinkedList.Node right) {

        LinkedList.Node result = null;
        LinkedList.Node currhead = null;

        if (left.data <= right.data) {
            result = left;
            left = left.next;
        } else {
            result = right;
            right = right.next;
        }
        currhead = result;


        while (left != null && right != null) {
            if (left.data <= right.data) {
                result.next = left;
                left = left.next;

            } else {
                result.next = right;
                right = right.next;
            }
            result = result.next;
        }

        while (left != null) {
            result.next = left;
            left = left.next;
            result = result.next;

        }
        while (right != null) {
            result.next = right;
            right = right.next;
            result = result.next;
        }


        return currhead;
    }

    private static LinkedList.Node findMidOfLinkedList(LinkedList.Node head) {

        LinkedList.Node slow = head, fast = head;
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // System.out.println(slow.data);
        return slow;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList.head = new LinkedList.Node(2);
        ll.head.next = new LinkedList.Node(1);
        ll.head.next.next = new LinkedList.Node(3);
        ll.head.next.next.next = new LinkedList.Node(14);
        ll.head.next.next.next.next = new LinkedList.Node(24);
        LinkedList.Node sortedList = sortLinkedList(LinkedList.head);
        LinkedList.printLinkedList(sortedList);
    }

}
