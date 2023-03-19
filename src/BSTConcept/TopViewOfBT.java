package BSTConcept;

import java.util.*;
import java.util.TreeMap;

class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node n, int h) {
        node = n;
        hd = h;
    }
}

public class TopViewOfBT {

    public static void topView(Node root) {
        Map<Integer, Integer> m = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));


        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            if (!m.containsKey(hd)) {
                m.put(hd, curr.key);
            }

            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
            }
        }


        System.out.println(m.values());


    }


    public static void bottomView(Node root) {
        Map<Integer, Integer> m = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));


        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;

                m.put(hd, curr.key);


            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
            }
        }


        System.out.println("===>"+ m.values());
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        topView(root);
        System.out.println();
        bottomView(root);

    }
}
