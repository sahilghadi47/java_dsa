package Arrays2d;
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.


// You must do it in place.
// Example 1:

// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
public class setMatrix0 {
    static int[][] sol(int [][] matrix){
        int n = matrix.length;
        int m= matrix[0].length;
        
        int row [] = new int[n] ;
        int col [] = new int[m];


        for(int i=0 ;i<n; i++){
            for(int j =0; j<m ;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0 ;i<n; i++){
            for(int j =0; j<m ;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        
        return matrix;
    }
    public static void main(String[] args) {
        int [][] matrix = { {1,1,1},
                            {1,1,1},
                            {1,0,1} };
        sol(matrix);
        int n = matrix.length;
        int m = matrix[0].length;
        printMatrix.print(matrix, n, m);
    }
    
}
