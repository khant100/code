package concept.Graph;

//Problem Statement: Given a binary grid of N*M. Find the distance of the nearest 1 in the grid for each cell.
//
//        The distance is calculated as |i1  - i2| + |j1 - j2|, where i1, j1 are the row number and column number of the current cell,
//        and i2, j2 are the row number and column number of the nearest cell having value 1.

// Time Complexity: O(NxM + NxMx4) ~ O(N x M)
// Space Complexity: O(N x M) + O(N x M) + O(N x M) ~ O(N x M)
import java.util.LinkedList;
import java.util.Queue;

class nod{
    int first;
    int scond;

    public nod(int first, int scond, int third) {
        this.first = first;
        this.scond = scond;
        this.third = third;
    }

    int third;


}
public class DistanceOfnearestcell {
    public int[][] nearest(int[][] grid){
        int n= grid.length;
        int m = grid[0].length;
        int[][] distance = new int[n][m];
        int[][] vis = new int[n][m];
        Queue<nod> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    vis[i][j]=1;
                    q.add(new nod(i,j,0));
                }else{
                    vis[i][j]=0;
                }

            }
        }

        int[] row = {-1,0,1,0};
        int[] col ={0,1,0,-1};
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().scond;
            int steps = q.peek().third;
            q.remove();
            distance[r][c]=steps;

            for(int i=0;i<4;i++){
                int rr = r+row[i];
                int cc = c+col[i];
                if(rr>=0&&rr<n&&cc>=0&&cc<m&&vis[rr][cc]==0){
                    vis[rr][cc]=1;
                    q.add(new nod(rr,cc,steps+1));
                }
            }


        }
return distance;
    }

    public static void main(String args[]){
        int[][] grid = {
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1}
        };
DistanceOfnearestcell d = new DistanceOfnearestcell();
int[][] ans=d.nearest(grid);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
