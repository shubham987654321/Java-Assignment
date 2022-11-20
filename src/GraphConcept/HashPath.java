 package GraphConcept;

 import com.sun.org.apache.xpath.internal.operations.Bool;

 import java.util.HashMap;

 /*
 Q > We have to given two vertex we have to  find that
  is there any path b.w. both vertex is exist or not.
  */
public class HashPath {
    public static void main(String[] args) {
        // Create a Graph
        Graph gp = new Graph();
        gp.addVertex("A");
        gp.addVertex("B");
        gp.addVertex("C");
        gp.addVertex("D");
        gp.addVertex("E");
        gp.addVertex("F");
        gp.addVertex("G");

        // Add Edge b.w Vertex
        gp.addEdge("A","D",1);
        gp.addEdge("A","B",1);
        gp.addEdge("B","C",1);
        gp.addEdge("C","D",1);
//        gp.addEdge("D","E",1);
        gp.addEdge("E","F",2);
        gp.addEdge("E","G",2);
        gp.addEdge("F","G",4);

        gp.printGraph();
        // Check is Path is Persent b.w. two vertex or not
        Boolean isPath  = gp.hasPath("A","A", new HashMap<>());
        System.out.println("Path is Present "+isPath);

    }

}
