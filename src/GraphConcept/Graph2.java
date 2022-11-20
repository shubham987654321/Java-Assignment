package GraphConcept;

import ArrayConcept.Array;

import java.io.PrintStream;
import java.util.ArrayList;


// create Graph with the help Adjacency List
public class Graph2 {
    // number of vertex
    public  int v;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public  void totalVertex(int v){
        // add the vertex
        this.v=v ;
        for(int i=0;i<this.v;i++){
            adj.add(new ArrayList<>());
        }
    }

    // add the edge
    public void addEdge(int vname1, int vname2){
        adj.get(vname1).add(vname2);
        adj.get(vname2).add(vname1);
    }

    // show the graph
    public  void showGraph(){
        for(int i=0;i<v;i++){
             System.out.println(i + ": "+adj.get(i).toString());
        }
    }

    // remove an Edge
    public void removeEdge(int vname1, int vname2){
        adj.get(vname1).remove(Integer.valueOf(vname2));
        adj.get(vname2).remove(Integer.valueOf(vname1));
    }

    // remove an vertex
    public void removeVertex(int vname1){

    }

    // Create a Graph
    public static void main(String[] args) {
        Graph2 gp = new Graph2();

        gp.totalVertex(5);
        gp.addEdge(1,2);
        gp.addEdge(4,2);
        gp.addEdge(0,1);
        gp.showGraph();
        System.out.println("After Removal of Edge");
        gp.removeEdge(2,4);
        gp.showGraph();

    }
}


