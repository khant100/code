package DSACCodingInt.Tree;

import java.util.ArrayList;

public class GraphNode {
    int data;
    public boolean visited;
    public ArrayList<GraphNode> neigbour ;

    public GraphNode(int data) {
        this.data = data;
        visited=false;
         neigbour = new ArrayList<>();
    }

    public void visit(){
        visited = true;
    }

    public ArrayList<GraphNode> getNeigbour(){
        return neigbour;
    }

    public void addNeightbour(GraphNode neighbour){
        neigbour.add(neighbour);
        neighbour.neigbour.add(this);
    }
    public void addDirctedNeightbour(GraphNode neighbour){
        neigbour.add(neighbour);
    }
}
