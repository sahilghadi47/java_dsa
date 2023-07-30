package sortingAlgos;


public class selectionSort{
    static void sort(int arr[] , int n){
        
        int minIndex;
        for(int i =0 ;i<n;i++){
            minIndex = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            swap.arraysort(arr, i,minIndex);
        }

    }
    public static void main(String[] args) {
        int arr[]= {2,5,6,5,3,1,0,1,4};
        sort(arr, arr.length);
        print.printArray(arr);
    }

}