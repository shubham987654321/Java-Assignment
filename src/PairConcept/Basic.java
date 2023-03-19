package PairConcept;

import javafx.util.Pair;

public class Basic {
    public static void main(String[] args) {
        Pair<Integer,Integer> p = new Pair<>(2,4);
        System.out.println(p.getValue());
        System.out.println(p.getKey());
    }
}

