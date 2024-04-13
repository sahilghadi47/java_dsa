// # Matrix: {1 2 3 }
// #         {4 5 6 }
// #         {7 8 9 }

// # Ans:    {3 2 1 }
// #         {6 5 4 }
// #         {9 8 7 }

package Arrays2D;

public class reverseMatrix {
   static void reverse(int[][]matrix , int n){
        for(int i =0;i<n;i++){
            int start =0;
            int end = n-1;
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] =matrix[i][end];
                matrix[i][end] =temp;
                start++;
                end--;

            }
        }
   } 
   public static void main(String[] args) {
    int [][] matrix ={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int n = matrix.length;
    reverse(matrix, n);
    printMatrix.print(matrix, n, n);
   }
}
