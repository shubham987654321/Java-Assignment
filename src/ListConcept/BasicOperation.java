package ListConcept;

/*
List Type = ArrayList, LinkedList, Vector

add (Object o)-> add method to the Last
get(int index)
set(int index, Object o)
indexOf(Object o)
lastIndexOf(Object o)
sublist(fromIndex, toIndex)


==============ArrayList
when we add any item in arrayList then
Default capacity =10

Next time capacity = 10 + 10>>1= 15

ArrayList only store Object so we can not pass any primitive
data type like int , char, bool etc.

===========Linked List
1. It is doubly Linked List.
Node next, previous
head ==> Pointing starting node
tail ==> Pointing to Last Node

list.clone() == return Object type so we have to type cast
getLast(), getFirst(), addLast(), addFirst();
removeFirstOccurence()


============== Vector Class
Similar Like ArrayList
Simply Doubles the previous Size
Default capacity  = 10
Next Capacity  = 10*2 = 10
v.ensureCapacity(20);


============================ Difference ========
Indexing --> ArrayList, Vector (For Proper Indexing)
Thread Safety  --> Vector ( For Multi Threading)
Insert in Middle --> LinkedList
Removal at First and Addition in  Last --> LinkedList

 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class BasicOperation {
    public static void main(String[] args) {
        ArrayList arr  = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add('h');
        System.out.println(arr);

        // It only store Integer
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        System.out.println(arr2.toString());
        System.out.println(arr2.size());


     ArrayList<int []> arr3 = new ArrayList<>();


//        Linked List
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(1);
        llist.add(2);
        llist.add(2,2);
        System.out.println(llist.contains(2));

        LinkedList <Integer> llist1 = (LinkedList<Integer>) llist.clone();
        System.out.println(llist1);

        System.out.println(llist1.getFirst());
        System.out.println(llist1.getLast());
        System.out.println(llist1.removeFirstOccurrence(2));
        System.out.println(llist1);



//        Vector
        Vector<Integer> v = new Vector<>();
        v.ensureCapacity(20);
        v.add(1);
        v.add(3);
        System.out.println(v.contains(3));
        ListIterator<Integer> list = v.listIterator();

        while (list.hasNext()){
            System.out.println(list.next());

        }

//print vector from back traversal
        while (list.hasPrevious()){
            System.out.println(list.previous());
        }

        System.out.println(v.toArray());
    }
}
