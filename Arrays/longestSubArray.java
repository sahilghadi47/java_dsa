//You are given an array 'a' of size 'n' and an integer 'k'.
//Find the length of the longest subarray of 'a' whose sum is equal to 'k'.

package Arrays;

import java.util.HashMap;

public class longestSubArray {
    int brute(int arr[], int k) {

        // Time complexity =O(N*2);
        int n = arr.length;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    longest = Math.max(longest, j - i + 1);
                if (sum > k)
                    break;
            }
        }
        return longest;
    }
    int hashing(int arr[] ,int k){
        int maxLen=0;
        HashMap<Long, Integer> preSum =new HashMap<>();
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k) maxLen = Math.max(maxLen, i+1);
            long rem = sum-k;
            if(preSum.containsKey(rem)){
                int len = i-preSum.get(rem);
                maxLen =Math.max(maxLen, len);
            }
            if(!preSum.containsKey(sum)){
                preSum.put(sum, i);
            } 
        }

        return maxLen;
    }

    public static void main(String[] args) {
        longestSubArray ans = new longestSubArray();
        int arr[] ={1,2,2,2,1,0,1,1,1,2,4,2};
        int k=4;
       System.out.println(ans.hashing(arr, k));
    }
}
