package GraphConcept;

import java.util.ArrayList;
import java.util.HashMap;
/*
   a : b:2
   b : a:2, c:2
   c: b:2
 */

public class Graph<auto> {
    private  class Vertex{
        HashMap<String,Integer> nbrs = new HashMap<>();
    }
    HashMap<String,Vertex>  vtces;
    public Graph(){
        vtces = new HashMap<>();
    }

    // find number of vertex in Graph
    public int numVertex(){
        return  this.vtces.size();
    }

    // check Vertex is present in current Graph
    public  Boolean containsVertex(String vname){
        return vtces.containsKey(vname);
    }

    // add a Vertex in Graph
    public  void addVertex(String vname){
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }
    //  Remove a Vertex
    public void removeVertex(String vname){
      // first remove all edge related with that vertex

        // find all neighbours which having edge with this vetex
        ArrayList<String> nbrs = new ArrayList<>();
        for(String str : vtces.get(vname).nbrs.keySet()){
            nbrs.add(str);
        }

        for(String str : nbrs){
            vtces.get(str).nbrs.remove(vname);
        }
        vtces.remove(vname);
    }


    // find total number of Edges in Graph
    public  int numEdge(){
       int totalEdge = 0;

      for(String vtx : vtces.keySet()){
          totalEdge += vtces.get(vtx).nbrs.size();
      }

      return  totalEdge/2;
    }

    // Check  is Edge present  b.w two vertex
    public Boolean containsEdge(String vname1, String vname2){
        Vertex  vtx1  = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);

        if(vtx1 == null || vtx2== null || !vtx1.nbrs.containsKey(vname2)){
            return  false;
        }
        return  true;
    }

    // add Edge b.w two Vertex
    public void addEdge(String vname1, String vname2, int cost){
        // check is Edge is already present b.w. both vertex or not
        Vertex  vtx1  = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);

        if(vtx1 == null || vtx2== null || vtx1.nbrs.containsKey(vname2)){
            return;
        }
        vtx1.nbrs.put(vname2,cost);  // adding neighbours in vertex
        vtx2.nbrs.put(vname1,cost);


    }

    public void removeEdge(String vname1, String vname2){
        // check is Edge is already persent b.w. both vertex or not
        Vertex  vtx1  = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);

        if(vtx1 == null || vtx2== null || !vtx1.nbrs.containsKey(vname2)){
            return;
        }
        vtx1.nbrs.remove(vname2);
        vtx2.nbrs.remove(vname1);
    }

    public void  printGraph(){
       for(String vtx : vtces.keySet()){
           Vertex vertex = new Vertex();
           vertex = vtces.get(vtx);
           System.out.print("Vertex " + vtx  + " "+vertex.nbrs);
           System.out.print("\n");
       }
    }




}
