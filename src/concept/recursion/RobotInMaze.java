package concept.recursion;

import java.util.ArrayList;

public class RobotInMaze {
private void findallPath(int i,int j,int m,int n,int[][] mat,int[][] vis,ArrayList<String> ans,StringBuilder temp){
if(i==m-1&&j==n-1){
    ans.add(temp.toString());
    return;
}
    if(i<0||j<0||i>=n||j>=m||vis[i][j]==1||mat[i][j]==0){
        return;
    }
    vis[i][j]=1;

    temp.append("D");
    findallPath(i+1,j,m,n,mat,vis,ans,temp);
    temp.deleteCharAt(temp.length()-1);

    temp.append("L");
    findallPath(i,j-1,m,n,mat,vis,ans,temp);
    temp.deleteCharAt(temp.length()-1);

    temp.append("R");
    findallPath(i,j+1,m,n,mat,vis,ans,temp);
    temp.deleteCharAt(temp.length()-1);
    temp.append("U");
    findallPath(i-1,j,m,n,mat,vis,ans,temp);
    temp.deleteCharAt(temp.length()-1);

    vis[i][j]=0;

}
    private ArrayList< String > findPath(int[][] mat){
        int n =mat.length;
        int m = mat[0].length;
        ArrayList<String> ans = new ArrayList<>();
        int[][] vis = new int[n][m];
        StringBuilder sb = new StringBuilder();
        findallPath(0,0,m,n,mat,vis,ans,sb);
        return ans;
    }
    public static void main(String[] args) {

    int n = 4;
    int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

    RobotInMaze obj = new RobotInMaze();
    ArrayList< String > res = obj.findPath(a);
    if (res.size() > 0) {
        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
        System.out.println();
    } else {
        System.out.println(-1);
    }
}


    
}
