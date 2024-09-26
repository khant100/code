package DSACCodingInt.Array;




/**
 * Problem: Rotate Matrix: Given an image represented by an NxN matrix, where
 * each pixel in the image is 4 bytes, write a method to rotate the image by 90
 * degrees. Can you do this in place? */


public class RotateMatric90 {

    private void matrixRotate(int[][] matrix){
        int len = matrix.length;
        for (int layer = 0; layer < len / 2; layer++) {
            int first = layer;
            int last = len - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                // left -> top
                matrix[first][i] = matrix[last - offset][first];
                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top;
            }
        }
    }

    private  void printMx(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        RotateMatric90 rotateMatric90 = new RotateMatric90();
        rotateMatric90.printMx(matrix1);
        rotateMatric90.matrixRotate(matrix1);
        rotateMatric90.printMx(matrix1);
    }
}
