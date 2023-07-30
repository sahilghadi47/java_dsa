package sortingAlgos;

public class swap {
    static void arraysort(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        swap.arraysort(arr, 1, 2);

        print.printArray(arr);
    }
}
