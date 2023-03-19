package BSTConcept;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair1 {
    TreeNode node;
    int hd;

    Pair1(TreeNode n, int h) {
        node = n;
        hd = h;
    }
}

class Solution {
    public void findBottomLeftValue(TreeNode root) {
        Map<Integer, Integer> m = new TreeMap<>();
        Queue<Pair1> q = new LinkedList<>();
        q.add(new Pair1(root, 0));
        int res = root.val;
        int lastValue = root.val;

        while (!q.isEmpty()) {
            Pair1 p = q.poll();
            TreeNode curr = p.node;
            int hd = p.hd;

            if (!m.containsKey(hd)) {
                m.put(hd, curr.val);
                lastValue = curr.val;
            }

            if (curr.left != null) {
                q.add(new Pair1(curr.left, hd + 1));
            }
            if (curr.right != null) {
                q.add(new Pair1(curr.right, hd + 1));
            }
        }

        System.out.println(lastValue);


    }

    public List<Integer> rightView(TreeNode root) {
        Map<Integer, Integer> m = new TreeMap<>();
        Queue<Pair1> q = new LinkedList<>();
        q.add(new Pair1(root, 0));

        while (!q.isEmpty()) {
            Pair1 p = q.poll();
            TreeNode t = p.node;
            int h = p.hd;

            if (!m.containsKey(h)) {
                m.put(h, t.val);
            }
            if (t.right != null) {
                q.add(new Pair1(t.right, h + 1));
            }
            if (t.left != null) {
                q.add(new Pair1(t.left, h +1));
            }
        }

        List<Integer> l = new ArrayList<>(m.values());
        return l;
    }
}

public class FindBottomLeftTreeValue {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
         root.left.left.left= new TreeNode(90);
        root.left.right = new TreeNode(50);

        Solution s = new Solution();
        s.findBottomLeftValue(root);
        System.out.println(s.rightView(root));

    }
}
