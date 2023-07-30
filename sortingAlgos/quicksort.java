package sortingAlgos;

public class quicksort {

    static int partion(int arr[], int s, int e) {

        int pivot = arr[s];

        int count = 0;
        // count elements less than pivot
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot)
                count++;
        }

        int pivotIndex = s + count;

        // place pivot at its approprite place
        swap.arraysort(arr, s, pivotIndex);

        // cheak whether all element before pivotindex less than pivot
        // and elements after pivot are greater than pivot

        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i < pivotIndex && j > pivotIndex) {
                swap.arraysort(arr, i, j);
            }

        }
        return pivotIndex;
    }

    static void sort(int arr[], int s, int e) {

        if (s >= e)
            return;

        // creating partion
        int p = partion(arr, s, e);

        // sorting array before partion 
        sort(arr, s, p - 1);

        // sorting array before partion
        sort(arr, p + 1, e);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 5, 3, 1, 0, 1, 4 };
        sort(arr, 0, arr.length - 1);
        print.printArray(arr);
    }
}
