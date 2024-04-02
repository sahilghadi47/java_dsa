//find second largest element of given array

package Arrays;

import java.util.Arrays;

public class secondLargest {
    static int brute(int arr[] , int n){
        //time k
        Arrays.sort(arr);
        int Largest=arr[n-1];

        for(int i=n-2;i>=0;i--){
            if (arr[i]!=Largest) {
                return arr[i];
            }
        }
        return -1;
    }
    static int better(int arr[] , int n ){
        //time complexity =O(2N)
        int secondLarge = arr[0];
        int Largest =LargestElement.optimised(arr, n);
        for(int i=1;i<n;i++){
            if(arr[i]>secondLarge && arr[i]!=Largest) 
                secondLarge=arr[i];
        }
        return secondLarge;
    }
    static int optimised(int arr[], int n ){
        //time complexity =O(N)
        int Largest = arr[0];
        int secondLarge = -1;
        for(int i =1;i<n;i++){
            if(arr[i]>Largest){
                secondLarge = Largest;
                Largest =arr[i];
            }else if(arr[i]<Largest &&arr[i]>secondLarge)
                secondLarge=arr[i];

        }
        return secondLarge;
    }
    public static void main(String []args){
        int arr[] = { 1, 32, 3, 4, 25, 26, 7, 8, 9, 10 ,32};
        System.out.println(brute(arr,arr.length));

    }
}
