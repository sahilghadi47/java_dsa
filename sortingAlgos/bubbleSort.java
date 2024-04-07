package sortingAlgos;

public class bubbleSort {
    void swap(int[] arr, int j) {
        int temp =arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    void sort(int arr[] ){
        //ITERATIVE FUNCTION
        int size = arr.length-1;
        for(int i = 0;i<size;i++){
            for(int j =0;j<size-i;j++){
                if(arr[j]>arr[j+1])
                    swap(arr, j);
            }
        }
    }
    void sort(int arr[] ,int size){
        //RECURSIVE FUNCTION
        if(size ==0) return; 
        for(int j =0;j<size-1;j++){
            if(arr[j]>arr[j+1])
                swap(arr, j);
        }
        sort(arr, size-1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,2,1,4,7,5};
        BubbleSort ans = new BubbleSort();
        ans.sort(arr, arr.length);
        printArray.sol(arr);
    }
}
