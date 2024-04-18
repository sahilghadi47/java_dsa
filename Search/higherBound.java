package Search;
// You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.
// Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.
// Note:
// The upper bound in a sorted array is the index of the first value that is greater than a given value. 
// If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
// We are using 0-based indexing.
// Try to write a solution that runs in log(n) time complexity.
// Example:
// Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,
// Output: 2
// Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).
public class higherBound {
    static int sol(int arr[] , int k){
        int n = arr.length;
        int ans = n;
        int low =0;
        int high =n-1;
        while(low <=high){
            int mid = (low + high )-1;
            if(arr[mid]>k){
                ans = mid;
                high= mid -1;
            }else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,7};
        int k =5;
        System.out.println(sol(arr, k));
    }
}
