//The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.
// You are provided two arrays of integers of size N & M;
//you have to provide array of union of elements

package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class unionArray {

    static ArrayList<Integer> brute(int arr1[], int arr2[]) {
        //Using HashSet 
        //time complexity == (m + n) log(m+n)
        ArrayList<Integer> Ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        for (int n : hs) {
            Ans.add(n);
        }
        return Ans;
    }
    static ArrayList<Integer> optimal(int arr1[], int arr2[]) {
        // Using two Pointer approach
        // time complexity == (m + n)
        ArrayList<Integer> Ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]){ 
                if (Ans.size() == 0 || Ans.get(Ans.size() - 1) != arr1[i]) 
                    Ans.add(arr1[i]);
                    i++;
                
            } else {
                if (Ans.size() == 0 || Ans.get(Ans.size() - 1) != arr2[j]) 

                    Ans.add(arr2[j]);
                    j++;
                
            }

        }
        while (i < arr1.length) {
            if (Ans.get(Ans.size() - 1) != arr1[i]) 
                Ans.add(arr1[i]);
            i++;


        }
        while (j < arr2.length) {
            if (Ans.get(Ans.size() - 1) != arr2[j]) 
                Ans.add(arr2[j]);
            j++;

        }
        return Ans;
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = optimal(arr1, arr2);
        for (int val : Union)
            System.out.print(val + " ");
    }
}
