package concept.Graph;

import java.util.ArrayList;

public class DFS {



   public void dfs(int nod,int[] vis,ArrayList<Integer> df,ArrayList<ArrayList<Integer>> adj){
        vis[nod]=1;
        df.add(nod);

        for(Integer i : adj.get(nod)){
            //System.out.println(" "+i);
            if(vis[i]==0){
                dfs(i,vis,df,adj);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){

        int[] visited = new int[V+1];
        //visited[0]=true;
        ArrayList<Integer> df = new ArrayList<>();
        dfs(1,visited,df,adj);
        return df;


    }


    public static void main(String args[]){

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 9; i++) {
            adj.add(new ArrayList < > ());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(3);
        adj.get(4).add(8);
        adj.get(5).add(2);
        adj.get(6).add(2);
        adj.get(7).add(3);
        adj.get(7).add(8);
        adj.get(8).add(4);
        adj.get(8).add(7);

        DFS dfs = new DFS();
       ArrayList<Integer> a = dfs.dfsOfGraph(8,adj);

       for(int i=0;i<a.size();i++){
           System.out.print("->"+a.get(i));
        }



    }
}
