package sortingAlgos;

public class bubbleSort {
    static void sort(int arr[] , int n){
        for(int i =0;i<n;i++){
            for(int j=1;j<n-i ;j++){
                if(arr[j-1]>arr[j]){
                    swap.arraysort(arr, j-1, j);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]= {2,5,6,5,3,1,0,1,4};
        sort(arr, arr.length);
        print.printArray(arr);
    
    }
}
