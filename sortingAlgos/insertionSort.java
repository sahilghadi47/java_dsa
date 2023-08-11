package sortingAlgos;

public class insertionSort {

    static void sol(int arr[]) {
        int n = arr.length;
        int i = 1;
        while (i < n) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > temp)
                    arr[j + 1] = arr[j];
                else
                    break;
                j--;
            }
            arr[j + 1] = temp;
            i++;
        }

    }
    
    static void recursive(int arr[], int size) {
        if(size==0 ||size ==1) return;
          
        int s = arr.length - size + 1 ;
        int temp = arr[s];
        int j = s - 1;
        while (j >= 0) {
            if (arr[j] > temp)
                arr[j + 1] = arr[j];
            else
                break;
            j--;
        }
        arr[j + 1] = temp;
        recursive(arr, size-1);
    }
