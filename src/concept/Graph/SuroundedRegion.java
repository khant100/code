package concept.Graph;

public class SuroundedRegion {

    public static void dfs(int n,int m,int[] row,int[] col,int[][] vis,char[][] mat){
        vis[n][m]=1;
        for(int i=0;i<4;i++){
            int r =n+row[i];
            int c =m+col[i];
            if(r>=0&&r<n&&c>=0&&c<m&&vis[r][c]==0&&mat[r][c]=='O'){
                dfs(r,c,row,col,vis,mat);
            }
        }


    }

    private static char[][] filldfs(int n, int m,char[][] mat) {
        int[][] vis = new int[n][m];
        char[][] ans = new char[n][m];
        int[] row = {1, 0, -1, 0};
        int[] col = {0, -1, 0, 1};
        for (int i = 0; i < m; i++) {

            if (mat[0][i] == 'O' && vis[0][i] == 0) {
                dfs(0, i, row, col, vis, mat);
            }
            if (mat[n - 1][i] == 'O' && vis[n - 1][i] == 0) {
                dfs(n-1, i, row, col, vis, mat);
            }
        }
        for (int i = 0; i < n; i++) {

            if (mat[i][0] == 'O' && vis[i][0] == 0) {
                dfs(n, m, row, col, vis, mat);
            }
            if (mat[i][m - 1] == 'O' && vis[i][m - 1] == 0) {
                dfs(n, m, row, col, vis, mat);
            }

        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&mat[i][j]=='O'){
                    mat[i][j]='X';
                }
            }
        }
return mat;
    }

//    Time Complexity: O(N) + O(M) + O(NxMx4) ~ O(N x M), For the worst case,
//    every element will be marked as ‘O’ in the matrix,
//    and the DFS function will be called for (N x M) nodes and for every node,
//    we are traversing for 4 neighbors, so it will take O(N x M x 4) time.
//    Also, we are running loops for boundary elements so it will take O(N) + O(M).
//    Space Complexity ~ O(N x M), O(N x M) for the visited array,
//    and auxiliary stack space takes up N x M locations at max.
    public static void main(String[] args)
    {
        char mat[][] = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};

        // n = 5, m = 4

        char[][] ans = filldfs(5, 4, mat);
        for(int i = 0;i < 5;i++) {
            for(int j = 0;j < 4;j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

