package concept.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfDistictIsland {
//    Given a boolean 2D matrix grid of size n * m. You have to find the number of distinct islands where a group of connected 1s (horizontally or vertically) forms an island. Two islands are considered to be distinct if
//    and only if one island is not equal to another (not rotated or reflected).
//    public static void dfs(int[][] grid,int[][] vis,int row,int col,int row0,int col0,ArrayList<String> lis){
//        vis[row][col]=1;
//        String s = getSr(row-row0,col-col0);
//        lis.add(s);
//        int n = grid.length;;
//        int m = grid[0].length;
//        int[] r = {1,0,-1,0};
//        int[] c = {0,-1,0,1};
//        for(int i=0;i<4;i++){
//            int rr = row+r[i];
//            int cc=col+c[i];
//            if(rr>=0&&rr<n&&cc>=0&&cc<m&&grid[rr][cc]==1&&vis[rr][cc]==0){
//                dfs(grid,vis,rr,cc,row0,col0,lis);
//            }
//        }
//
//    }
//
//    public static String getSr(int i,int j){
//        return String.valueOf(i)+String.valueOf(j);
//    }
//    public static int NumOFIland(int[][] grid){
//        int n = grid.length;;
//        int m = grid[0].length;
//        int[][] vis = new int[n][m];
//        HashSet<ArrayList<String>> hashSet = new HashSet<>();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                ArrayList<String> s = new ArrayList<>();
//                dfs(grid,vis,i,j,i,j,s);
//                hashSet.add(s);
//            }
//        }
//        return hashSet.size();
//    }
public static void dfs(int[][] grid,int[][] vis,ArrayList<String> lis,int row,int col,int row0,int col0){
    int n =grid.length;
    int m =grid[0].length;
    String s=getStr(row-row0,col-col0);
    lis.add(s);
    vis[row][col]=1;
    int[] r ={1,0,-1,0};
    int[] c={0,-1,0,1};
    for(int i=0;i<4;i++){
        int rr=row+r[i];
        int cc=col+c[i];
        if(rr>=0&&rr<n&&cc>=0&&cc<m&&grid[rr][cc]==1&&vis[rr][cc]==0){
            dfs(grid,vis,lis,rr,cc,row0,col0);
        }
    }

}
    private static String getStr(int x,int y){
        return String.valueOf(x)+String.valueOf(y);
    }
    static int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        HashSet<ArrayList<String>> h = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&vis[i][j]==0){
                    ArrayList<String> ss = new ArrayList<>();
                    dfs(grid,vis,ss,i,j,i,j);
                    h.add(ss);
                }
            }
        }

        return h.size();
        // Your Code here
    }

    public static void main(String[] args)
    {
        int[][] grid = {{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}};
        int[][] grid1 = {{1, 1, 0, 1, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 1, 0, 1, 1}};
        System.out.println(countDistinctIslands(grid));

        System.out.println(countDistinctIslands(grid1));
    }
}
