package concept.Graph;

import java.util.LinkedList;
import java.util.Queue;


public class NoOfIsland {


    public static void bfs(int row,int col,int[][] visited,char[][] grid){
        visited[row][col]=1;
        Queue<cair> q = new LinkedList<>();
        q.add(new cair(row,col));

        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for(int drow=-1;drow<=1;drow++){
                for(int dcol=-1;dcol<=1;dcol++){
                    int nrow =r+drow;
                    int ncol = c+dcol;
                    if(nrow>=0&&nrow< grid.length&&ncol>=0&&ncol<grid[0].length
                    &&visited[nrow][ncol]==0&&grid[nrow][ncol]=='1'){
                        visited[nrow][ncol]=1;
                        q.add(new cair(nrow,ncol));
                    }

                }
            }
        }



    }
    public static  int noOfIsland(char[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visted = new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visted[i][j]==0&&grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,visted,grid);
                }
            }
        }
        return cnt;
    }
    public static void main(String args[]){

        char[][] grid = {{'0','1'},{'1','0'},{'1','1'},{'1','0'}};
        System.out.println(noOfIsland(grid));


    }
}

