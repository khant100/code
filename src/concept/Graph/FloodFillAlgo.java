package concept.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlgo {
    public static int[][] floodFill(int[][] given,int r,int c,int newCol){
        int n = given.length;
        int m = given[0].length;
        int[][] ans = given;
        int odcol=given[r][c];
        Queue<cair> q =new LinkedList<>();
    ans[r][c]=newCol;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        q.add(new cair(r,c));
        while(!q.isEmpty()){
            int ro=q.peek().row;
            int co=q.peek().col;
            q.remove();
            for(int i=0;i<4;i++){
                int row=drow[i]+ro;
                int col=dcol[i]+co;
                if(row>=0&&row<n&&col>=0&&col<m&&ans[row][col]!=newCol&&given[row][col]==odcol){
                    ans[row][col]=newCol;
                    q.add(new cair(row,col));
                }
            }
        }

        return ans;
    }

    public static void dfs(int[][] given,int[][] ans,int row,int col,int oldcol,int newCol,int[] drow,int[] dcol){
        ans[row][col]=newCol;
        for(int i=0;i<4;i++){
            int r =row+drow[i];
            int c= col+dcol[i];
            if(r>=0&&r<given.length&&c>=0&&c<given[0].length&&ans[r][c]!=newCol&&given[r][c]==oldcol){
                dfs(given,ans,r,c,oldcol,newCol,drow,dcol);
            }
        }
    }
    public static int[][] floodFillDfs(int[][] given,int row,int col,int newCol){
        int n = given.length;;
        int m = given[0].length;
        int[][] ans =given;
        //ans[row][col]=newCol;
        int[] drow ={-1,0,1,0};
        int[] dcol ={0,1,0,-1};
        int oldcol = given[row][col];

        dfs(given,ans,row,col,oldcol,newCol,drow,dcol);
        return ans;
    }

    static void printArray(int[][] giv){
        for(int i=0;i< giv.length ;i++){
            for (int j=0;j<giv[0].length;j++){
                System.out.print(" "+giv[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        //worst case complexity is n*M
        // for x numer of nodes we are travelling (x*4) = approx O(x) =(m*N) time complexity//
        // space complexity o(n*m) +(n*M) + delta(row) +delta(colum)

   printArray(floodFill(image,1,1,2));
    printArray(floodFillDfs(image,1,1,2));

    }
}
