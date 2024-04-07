package sortingAlgos;


public class InsertionSort {

    void swap(int arr[], int j){
        int temp =arr[j];
        arr[j] =arr[j-1];
        arr[j-1] = temp;
    }
    void sort(int arr[], int n){ //ITERATIVE FUNCTION()
        for(int i =0;i<n;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j);
                j--;
            }
        }
    }
    void sort(int arr[] , int i, int n){//RECURSIVE FUNCTION()
        if(i==n) return;
        int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j);
                j--;
            }
        sort(arr,i+1,n);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,2,1,4,7,5};
        InsertionSort ans = new InsertionSort();
        ans.sort(arr,0, arr.length);
        printArray.sol(arr);
    }
}
