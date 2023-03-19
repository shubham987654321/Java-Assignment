package GraphConcept;

import ArrayConcept.Array;

import java.io.PrintStream;
import java.util.ArrayList;


// create Graph with the help Adjacency List
public class Graph2 {
    // number of vertex
    public int v;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public int getTotalVertex() {
        return v;
    }

    public void totalVertex(int v) {
        // add the vertex
        this.v = v;
        for (int i = 0; i < this.v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // add the edge
    public void addEdge(int vname1, int vname2) {
        adj.get(vname1).add(vname2);
        adj.get(vname2).add(vname1);
    }

    // show the graph
    public void showGraph() {
        for (int i = 0; i < v; i++) {
            System.out.println(i + ": " + adj.get(i).toString());
        }
    }

    // remove an Edge
    public void removeEdge(int vname1, int vname2) {
        adj.get(vname1).remove(Integer.valueOf(vname2));
        adj.get(vname2).remove(Integer.valueOf(vname1));
    }

    // remove an vertex
    public void removeVertex(int vname1) {

    }


    // Has Path


    public boolean hasPath(int startVertex, int destinationVertex, boolean visited[]) {
        if (startVertex == destinationVertex) {
            return true;
        }
        visited[startVertex] = true;
        for (int i = 0; i < adj.get(startVertex).size(); i++) {
            if (!visited[adj.get(startVertex).get(i)]) {
                return hasPath(adj.get(startVertex).get(i), destinationVertex, visited);
            }

        }
        visited[startVertex] = false;
        System.out.println("No Path is found");

        return false;


    }

    public void printPath(int startVertex, int destinationVertex, boolean visited[], String path) {

        if (startVertex == destinationVertex) {
            System.out.println(path+destinationVertex);
            return ;
        }
        visited[startVertex] = true;
        for (int i = 0; i < adj.get(startVertex).size(); i++) {
            if (!visited[adj.get(startVertex).get(i)]) {
                 printPath(adj.get(startVertex).get(i), destinationVertex, visited, path+startVertex+"-");
            }

        }
        visited[startVertex] = false;



    }

    // Create a Graph
    public static void main(String[] args) {
        Graph2 gp = new Graph2();

        gp.totalVertex(5);
        gp.addEdge(1, 2);
        gp.addEdge(4, 2);
        gp.addEdge(2,3);
        gp.addEdge(3,4);
        gp.addEdge(0, 1);
        gp.showGraph();
        boolean visited[] = new boolean[gp.getTotalVertex()];
        boolean haspath = gp.hasPath(1, 3, visited);
        visited = new boolean[gp.getTotalVertex()];
        System.out.println("Path b.w two vertices");
        gp.printPath(0,4,visited,"");

        System.out.println(haspath);
        System.out.println("After Removal of Edge");
        gp.removeEdge(2, 4);
        gp.showGraph();

    }
}


