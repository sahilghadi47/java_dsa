// You are given an array 'arr' of length 'n', consisting of integers.
// A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning and 0 or more integers from the end of an array.
// Find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.
// The sum of an empty subarray is 0.

package Arrays;

public class maxSumSubarray {
    
    int brute(int arr[] ,int n){
        int maxSum=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxSum =Math.max(maxSum, sum);
            }
        }
        if(maxSum< 0) maxSum=0;
        return maxSum;
    }
    int kadanesAlgo (int arr[] , int n){
        int maxSum=Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(maxSum<sum) maxSum =sum;
            if (sum<0) sum =0;

        }

        if(maxSum< 0) maxSum=0;
        return maxSum;
    }
    public static void main(String[] args) {
        maxSumSubarray ans = new maxSumSubarray();
        int arr[]={-7,-8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
        System.out.println(ans.kadanesAlgo(arr, arr.length));
    }
}
