package concept.Graph;


import java.util.ArrayList;

// 1--->2_
// |     |^ __> 3
// 4---->5
//this are nodes with numner and edges are Lines
// way to represent Graph in matrix of n*m

//Both Udirected and directed
//1 2
//1 3
//2 3
//3 4
//2 5
// 4 5
public class SimpleGraph {


//int[][] graphMatrix = new int[3][3];

    private  ArrayList<ArrayList<Integer>> directed(){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<6;i++){
            adj.add(new ArrayList());
        }
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);adj.get(2).add(5);
        adj.get(4).add(5);
        return adj;

    }
    private ArrayList<ArrayList<Integer>> undirectedGraph(){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<6;i++){
            adj.add(new ArrayList());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);
        adj.get(2).add(5);
        adj.get(5).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);
        return adj;
    }
public static void main(String args[]){
        SimpleGraph s = new SimpleGraph();
    ArrayList<ArrayList<Integer>> undirected = s.undirectedGraph();
    ArrayList<ArrayList<Integer>> directed = s.directed();


    // storing undirected graph
    for(int i=0;i<directed.size();i++){
        System.out.println(i+"-> " +directed.get(i));
    }

    for(int i=0;i<undirected.size();i++){
        System.out.println(i+"-> "+undirected.get(i));
    }

}




}
