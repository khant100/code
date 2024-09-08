package DSACCodingInt.Array;


/**
 *
 * Problem: Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0.
 *
 * Solution: We can reduce the space to O(1) by using the first row as a
 * replacement for the row array and the first column as a replacement for the
 * column array. This works as follows: 1. Check if the first row and first
 * column have any zeros, and set variables rowHasZero and columnHasZero. (We'll
 * nullify the first row and first column later, if necessary.) 2. Iterate
 * through the rest of the matrix, seeing matrix[i][0) and matrix[0) [j] to zero
 * whenever there's a zero in matrix[i][j]. 3. Iterate through rest of matrix,
 * nullifying row i if there's a zero in matrix[i][0]. 4. Iterate through rest
 * of matrix, nullifying column j if there's a zero in matrix[ 0][ j]. 5.
 * Nullify the first row and first column, if necessary (based on values from
 * Step 1).
 *
 */
public class NullifyArray {

    public void nullifyMatrix(int[][] matrix){
        boolean fstRow = false;
        boolean fstCol = false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[0][i]==0){
                fstRow=true;
                break;
            }
        }

        for(int i=0;i<matrix[0].length;i++){
            if(matrix[i][0]==0){
                fstCol=true;
                break;
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                nulifyRow(matrix,i);
            }

        }

        for(int i=0;i<matrix[0].length;i++){
                nulifyRow(matrix,i);
        }

        if(fstCol){
            nulifyCol(matrix,0);
        }
        if (fstRow){
            nulifyRow(matrix,0);
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }


    }

    private void nulifyRow(int[][] mat,int row){
        for(int i=0;i<mat[row].length;i++){
            mat[row][i]=0;
        }
    }

    private void nulifyCol(int[][] mat,int col){
        for(int i=0;i<mat.length;i++){
            mat[i][col]=0;
        }
    }

    public static void main(String[] args) {
        NullifyArray matrix = new NullifyArray();
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
        matrix.nullifyMatrix(matrix1);
    }




}
