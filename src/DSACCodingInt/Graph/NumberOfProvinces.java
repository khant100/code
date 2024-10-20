package DSACCodingInt.Graph;

import java.util.ArrayList;

public class NumberOfProvinces {


    public int numOFProv(ArrayList<ArrayList<Integer>> adj , int v){
        ArrayList<ArrayList<Integer>> adjl = new ArrayList<>();

        for(int i=0;i<v;i++){
            adjl.add(new ArrayList<Integer>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(adj.get(i).get(j)==1&& i!=j){
                    adjl.get(i).add(j);
                    adjl.get(j).add(i);
                }
            }
        }
adjl.stream().forEach(x->System.out.println(x));
        int[] vis = new int[v];
        int cnt=0;
        for (int i=0;i<v;i++){
            if(vis[i]==0){
                cnt++;
                dfs(vis,i,adjl);
            }
        }

return cnt;
    }

private void dfs(int[] v,int node,ArrayList<ArrayList<Integer>> adjs){
        v[node]=1;
        for(Integer it :adjs.get(node)){
            if(v[it]==0){
                dfs(v,it,adjs);
            }
        }
}


public static void main(String args[]){
        NumberOfProvinces n = new NumberOfProvinces();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(new ArrayList<>());
    arrayLists.add(new ArrayList<>());
    arrayLists.add(new ArrayList<>());
    arrayLists.get(0).add(1);
    arrayLists.get(0).add(0);
    arrayLists.get(0).add(1);
    arrayLists.get(1).add(0);
    arrayLists.get(1).add(1);
    arrayLists.get(1).add(0);
    arrayLists.get(2).add(1);
    arrayLists.get(2).add(0);
    arrayLists.get(2).add(1);

       System.out.println( n.numOFProv(arrayLists,3));
}

}
