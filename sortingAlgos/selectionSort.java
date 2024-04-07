package sortingAlgos;


public class selectionSort{
   void swap(int arr[] , int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void sort(int arr[]){
        int size = arr.length;
        for(int i =0;i<size;i++){
            int sIdx =i;
            for(int j=i+1;j<size;j++){
                if(arr[sIdx]> arr[j]) sIdx = j;
            }
            swap(arr, i, sIdx);
        }
    }

    void sort(int arr[] ,int n ){
        if(n== 0) return ;
        int  i = arr.length - n;
        int s = i;
        for(int j =i;j<arr.length;j++){
            if(arr[s]>arr[j]) s=j;

        }
        swap(arr, i, s);
        sort(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,2,56,1,4,6, 7,8,6,5};
        printArray.sol(arr);
        System.out.println();
        SelectionSort ans = new SelectionSort();
        ans.sort(arr,arr.length);
        printArray.sol(arr);
    }

}
