package Search;
// Problem statement
// You are given an array 'arr' of size 'n' having unique elements that has been sorted in ascending order and rotated between 1 and 'n' times which is unknown.
// The rotation involves shifting every element to the right, with the last element moving to the first position. For example, if 'arr' = [1, 2, 3, 4] was rotated one time, it would become [4, 1, 2, 3].
// Your task is to find the minimum number in this array.
// Note :
// All the elements in the array are distinct. 
// Example :
// Input: arr = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] and it was rotated 3 times.
public class lowestElement {
    static int lowest(int arr[]){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[low] <= arr[high]){
                ans = Math.min(ans,arr[low]);
                break;
            }
            if(arr[low ]<= arr[mid]){
                ans = Math.min(ans , arr[low]);
                low = mid +1;
            }else{
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
   public static void main(String[] args) {
    int arr[] ={17,18,19,20,21,16};
    System.out.println(lowest(arr));
   } 
}
