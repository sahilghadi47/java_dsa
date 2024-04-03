//Given an Array of size N and int K . Rotate an array to left D times such that element  
//arr[] ={1,2,3,4,5,6};
// d==1 [2,3,4,5,6,1];
//d==2 [3,4,5,6,1,2];
//d==3 [4,5,6,1,2,3];

package Arrays;

public class rotateArray {
    static void Sol(int arr[], int n, int k){
        k = k%n;
        int []temp  =new int [k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i =n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Sol(arr, 10, 5);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}

