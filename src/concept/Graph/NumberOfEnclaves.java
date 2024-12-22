package concept.Graph;

import java.util.LinkedList;
import java.util.Queue;

class bair{
    int first;
    int second;
    public bair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

public class NumberOfEnclaves {

    public static void dfs(int[][] grid,int[][] vis,int row,int col,int[] r,int[] c){
        vis[row][col]=1;
        for(int i=0;i<4;i++){
            int rr=row+r[i];
            int cc=col+c[i];
            if(rr>=0&&rr< grid.length&&cc>=0&&cc<grid[0].length&&vis[rr][cc]==0&&grid[rr][cc]==1){
                dfs(grid,vis,rr,cc,r,c);
            }
        }
    }
    public int numberOfEnclavesbfs(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        int[][] vis = new int[n][m];
        int[] r ={1,0,-1,0};
        int[] c = {0,-1,0,1};
        Queue<bair> b = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                b.add(new bair(i,0));
            }
            if(grid[i][m-1]==1){
                b.add(new bair(i,m-1));
            }

        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                b.add(new bair(0,i));
            }
            if(grid[m-1][i]==1){
                b.add(new bair(m-1,i));
            }
        }

        while(!b.isEmpty()){
            int row = b.peek().first;
            int col = b.peek().second;
            vis[row][col]=1;
            b.remove();
            for(int i=0;i<4;i++){
                int rr =row+r[i];
                int cc =col+c[i];
                if(rr>=0&&rr<n&&cc>=0&&cc<m&&grid[rr][cc]==1&&vis[rr][cc]==0){
                    b.add(new bair(rr,cc));
                }
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]==1){
                    count++;
                }

            }
        }
        return count;

    }
    public int numberOfEnclavesdfs(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        int[][] vis = new int[n][m];
        int[] r ={1,0,-1,0};
        int[] c = {0,-1,0,1};
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                dfs(grid,vis,i,0,r,c);
            }
            if(grid[i][m-1]==1){
                dfs(grid,vis,i,m-1,r,c);
            }

        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                dfs(grid,vis,0,i,r,c);
            }
            if(grid[m-1][i]==1){
                dfs(grid,vis,m-1,i,r,c);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(vis[i][j]==0&&grid[i][j]==1){
                   count++;
               }

            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        int grid[][] = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};

        NumberOfEnclaves ob = new NumberOfEnclaves();
        int ans = ob.numberOfEnclavesdfs(grid);
        int ans1=ob.numberOfEnclavesbfs(grid);
        System.out.println(ans);
        System.out.println(ans1);
    }

//    Time Complexity: O(NxMx4) ~ O(N x M), For the worst case, assuming all the pieces as land,
//    the BFS function will be called for (N x M) nodes and for every node, we are traversing for 4 neighbors,
//    so it will take O(N x M x 4) time.
//
//    Space Complexity ~ O(N x M), O(N x M) for the visited array,
//    and queue space takes up N x M locations at max.

}
