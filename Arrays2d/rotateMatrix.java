// matrix: {1 2 3 }
//         {4 5 6 }
//         {7 8 9 }

// ans:    {7 4 1 }
//         {8 5 2 }
//         {9 6 3 }

package Arrays2d;

public class rotateMatrix {
    static void brute(int [] [] matrix){
        int n = matrix.length;
        int ans[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                ans[j][(n-1) -i] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] =ans[i][j];
            }
        }
    }
    static void optimised(int [][]matrix){
        int n = matrix.length;
        transposeMatrix.transpose(matrix, n);
        reverseMatrix.reverse(matrix, n);
        
    }
    public static void main(String[] args) {
        int [][] matrix ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = matrix.length;
        optimised(matrix);
        printMatrix.print(matrix, n, n);
    }
}
