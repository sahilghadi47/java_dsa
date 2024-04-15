package Arrays2d;

public class printMatrix {
    static void print(int [][] matrix , int n, int m){
        for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<m;j++ ){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
