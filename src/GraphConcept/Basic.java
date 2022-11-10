package GraphConcept;



public class Basic {

    public static void main(String[] args) {
        Graph gp = new Graph();
        gp.addVertex("a");
        gp.addVertex("b");
        gp.addVertex("c");
        gp.addVertex("d");
        gp.addEdge("a","b",2);
        gp.addEdge("b","c",3);
        gp.addEdge("b","d",4);
        gp.printGraph();
        System.out.println("After Removing Vertex (a)" )  ;
        gp.removeVertex("a");
        gp.printGraph();
        System.out.println("After Removing Edge");
        gp.removeEdge("b","d");
        gp.printGraph();

        System.out.println("Number of Edge in Graph "+gp.numEdge() );
        System.out.println("Number of Edge in Graph "+gp.numEdge() );
        System.out.println("Edge b.w. two vertex "+gp.containsEdge("d","c") );
        System.out.println("Edge b.w. two vertex "+gp.containsEdge("b","c") );







    }


}
