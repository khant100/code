package DSA.medium.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class IsLandProb {

    public int isIsland(char[][] grid){
        if(grid==null||grid.length==0){
            return 0;
        }
        int island =0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] direction = {{1,0},{0,-1},{-1,0},{0,1}};

        Queue<int[]> queue = new ArrayDeque<>();

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){

                if(grid[i][j]=='1'){
                    island++;
                    queue.offer(new int[]{i,j});
                    while(queue!=null){
                        int[] cur = queue.poll();
                        int x = cur[0];
                        int y= cur[1];
                        if(x<0||x>m||y<0||y>n||grid[x][y]=='1'){
                            continue;}
                        for(int[] dir:direction){
                            int nx = x+dir[0];
                            int ny = y+dir[1];
                            if(nx>=0&&nx<m&&ny>=0&&ny<n&&grid[nx][ny]=='1'){
                                queue.offer(new int[]{nx,ny});
                            }
                        }

                    }


                }
            }
        }
    return island;
    }
}
