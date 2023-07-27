package Arrays;

import java.util.ArrayList;

public class arrayIntersection {

    static ArrayList<Integer> intersection(int arr1[], int m, int arr2[], int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] > arr2[j]) {
                j++;

            }
            else if(arr2[j]>arr1[i]){
                i++;
            }
            else {
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2,2,3, 3, 4,4,5,5,5,5, 5, 6, 6, 7 };
        int arr2[] = { 2, 2, 3,3, 5,5, 6 };

        System.out.println(intersection(arr1, arr1.length, arr2, arr2.length));
    }
}