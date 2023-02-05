package GraphConcept;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Print all fist neighbours (node) which is 1 distance from source node, then 2nd and so on
 */
public class BFSConcept {




    public static void main(String[] args) {
        // Create a Graph
        Graph gp = new Graph();
//        gp.addVertex("A");
//        gp.addVertex("B");
//        gp.addVertex("C");
//        gp.addVertex("D");
//        gp.addVertex("E");
//        gp.addVertex("F");
//        gp.addVertex("G");
//
//        // Add Edge b.w Vertex
//        gp.addEdge("A","D",1);
//        gp.addEdge("A","B",1);
//        gp.addEdge("B","C",1);
//        gp.addEdge("C","D",1);
//        gp.addEdge("D","E",1);
//        gp.addEdge("E","F",2);
//        gp.addEdge("E","G",2);
//        gp.addEdge("F","G",4);


        // Another Example
        gp.addVertex("0");
        gp.addVertex("1");
        gp.addVertex("2");
        gp.addVertex("3");
        gp.addVertex("4");


        // Add Edge
        gp.addEdge("0","1",2);
         gp.addEdge("0","2",2);
          gp.addEdge("0","3",2);
           gp.addEdge("2","4",2);
        gp.printGraph();
//        gp.BFS("0");
    }

}
