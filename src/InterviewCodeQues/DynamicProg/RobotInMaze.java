package InterviewCodeQues.DynamicProg;

public class RobotInMaze {


    public static int uniquePath(int m , int n){
        int[][] maze = new int[m][n];

        for(int i=0;i<m;i++){
            maze[i][0]=1;
        }
        for(int i=0;i<n;i++){
            maze[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                maze[i][j]=maze[i][j-1]+maze[i-1][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+maze[i][j]);
            }
            System.out.println();
        }
      return   maze[m-1][n-1];
     }
    public static void main(String args[]){
        System.out.println(uniquePath(3,2));
        System.out.println(uniquePath(3,7));
    }
}
