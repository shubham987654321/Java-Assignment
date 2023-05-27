package IteratorDesignPattern;
import java.util.*;
public class MyLinkedList<T> implements Iterable<T>{


    static class Node<T>{
        T data;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    void addLast(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (size == 0) {
            head = tail = node;

        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    int getSize() {
        return size;
    }

     @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator(head);
    }

     class LinkedListIterator implements  Iterator<T>{
        Node temp;
        public LinkedListIterator(Node temp){
            this.temp = temp;

        }

       public T next(){
            T rv= (T) temp.data;
            temp = temp.next;
            return  rv;
        }
        public boolean hasNext(){
            if(temp!=null){
                return  true;
            }else{
                return  false;
            }

        }


    }

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(50);
        ll.addLast(90);
        ll.addLast(4);
        ll.addLast(100);
        ll.addLast(80);

        // iterate over the linkedlist

        for(int val : ll){
            System.out.println(val);
        }



    }
}
