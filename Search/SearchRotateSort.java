package Search;
// You have been given a sorted array/list 'arr' consisting of ‘n’ elements. You are also given an integer ‘k’.

// Now the array is rotated at some pivot point unknown to you.
// For example, if 'arr' = [ 1, 3, 5, 7, 8], then after rotating 'arr' at index 3, the array will be 'arr' = [7, 8, 1, 3, 5].

// Now, your task is to find the index at which ‘k’ is present in 'arr'.

// Note :
// 1. If ‘k’ is not present in 'arr', then print -1.
// 2. There are no duplicate elements present in 'arr'. 
// 3. 'arr' can be rotated only in the right direction.

// Example:
// Input: 'arr' = [12, 15, 18, 2, 4] , 'k' = 2
// Output: 3
public class SearchRotateSort {
    static int sol(int arr[], int k){
        int low =0; 
        int high = arr.length-1;
        while (low <= high){
            int mid = low + (high -low)/2;
            if(arr[mid] == k) return mid;
            if(arr[low] <= arr[mid]){
                if(arr[low]<=k && k <= arr[mid]) high = mid-1;
                else low = mid+1;
            }else{
                if(arr[mid] <= k && k <=arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,10,1,2,3,4,5,6};
        System.out.println(sol(arr ,5));
    }
}
