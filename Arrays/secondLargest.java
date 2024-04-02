//find second largest element of given array

package Arrays;

import java.util.Arrays;

public class secondLargest {
    static int brute(int arr[] , int n){
        
        Arrays.sort(arr);
        int Largest=arr[n-1];

        for(int i=n-2;i>=0;i--){
            if (arr[i]!=Largest) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String []args){
        int arr[] = { 1, 32, 3, 4, 25, 26, 7, 8, 9, 10 ,32};
        System.out.println(brute(arr,arr.length));

    }
}
