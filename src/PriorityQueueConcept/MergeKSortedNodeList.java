package PriorityQueueConcept;


import java.util.Iterator;
import java.util.PriorityQueue;

class ListNode {
    int val;
    private int size = 0;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;

    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;

    }


    public void printLinkedList(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }

    public int getSize(ListNode l) {
        int size = 0;
        while (l != null) {
            size++;
            l = l.next;
        }
        return size;
    }


}

public class MergeKSortedNodeList {

    public static class Pair implements Comparable {
        int data;
        int li;
        int di;

        @Override
        public int compareTo(Object o) {

            return data - ((Pair) o).data;
        }

    }


    public static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        ListNode currNode =  new ListNode();
        ListNode head = currNode;


        for (int i = 0; i < lists.length; i++) {
            Pair p = new Pair();
            p.data = lists[i].val;
            p.di = 0;
            p.li = i;
            pq.add(p);
        }



        while (pq.size() > 0) {
            Pair p = pq.peek();
            pq.remove();

            currNode = new ListNode(p.data);
            System.out.println(p.data);

            p.di++;


            // add next data of Node
            if (lists[p.li].next != null) {

                    lists[p.li] = lists[p.li].next;

                p.data = lists[p.li].val;
                pq.add(p);
                lists[p.li] =lists[p.li].next;
            }
            currNode = currNode.next;

        }

        return head;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);

        l1.next = new ListNode(10);
        l1.next.next = new ListNode(22);
        l1.next.next.next = new ListNode(90);
        l1.printLinkedList(l1);


        ListNode l2 = new ListNode(13, null);
        l2.next = new ListNode(11);
        l2.next.next = new ListNode(20);
        System.out.println();
        l2.printLinkedList(l2);
        System.out.println();
        ListNode[] lnode = new ListNode[2];
        lnode[0] = l1;
        lnode[1] = l2;

        ListNode resNode = mergeKLists(lnode);
        System.out.println("Linked List ");
        resNode.printLinkedList(resNode);


    }


}
