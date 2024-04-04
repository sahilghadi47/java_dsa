// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
package Arrays;

import java.util.Arrays;

public class mergeArray {
    static void brute(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m];
        for (int i = 0; i < m - n; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            arr[(m - n) + i] = nums2[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            nums1[i] = arr[i];
        }
    }

    static void merge(int[] arr, int m, int[] num, int n) {
        if (n == 0)
            return;

        int lastIdx = arr.length - 1;

        while (n > 0 && m > 0) {
            if (num[n - 1] >= arr[m - 1]) {
                arr[lastIdx] = num[n - 1];
                n--;
            } else {
                arr[lastIdx] = arr[m - 1];
                m--;
            }
            lastIdx--;
        }
        while (n > 0) {
            arr[lastIdx] = num[n - 1];
            n--;
            lastIdx--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 0, 0, 0 ,0};
        int m = 4;
        int[] num = { 2,4, 5, 6 };
        int n = 4;
        merge(arr, m, num, n);
        printArray.print(arr);
    }
}
