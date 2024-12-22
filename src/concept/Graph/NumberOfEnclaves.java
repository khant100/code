package concept.Graph;

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
    public static int numberOfEnclavesdfs(int[][] grid){
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
        System.out.println(ans);
    }



}
