// matrix: {1,2,3}
//         {4,5,6}
//         {7,8,9}

// ans:   {1 4 7 }
//        {2 5 8 }
//        {3 6 9 }



package Arrays2D;



public class transposeMatrix {
    static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i]=temp;
    }
    static void transpose(int[][]matrix ,int n){
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(i!=j){
                    swap(matrix, i, j);
                }
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
        transpose(matrix, n);
        printMatrix.print(matrix, n, n);
    }
}
