package Arrays;
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

public class firstLast {
    static int firstPosition(int arr[] , int target){
        int first = -1;
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target ){
                first = mid;
                high = mid-1; 
            }
            else if(arr[mid]< target) low = mid+1;
            else high = mid-1;
        }
        return first;
    }
    static int lastPosition(int arr[] , int target){
        int last = -1;
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target ){
                last = mid;
                low = mid + 1; 
            }
            else if(arr[mid]< target) low = mid+1;
            else high = mid-1;
        }
        return last;
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = firstPosition(nums , target);
        int last = lastPosition(nums , target);
        int res [] = {first, last};
        return res;
    }
    public static void main(String[] args) {
        int arr [] = {0,0,1,1,1,1,1,1,1,2,3};
        int ans [] = searchRange(arr, 1);
        printArray.print(ans);
    }
}
