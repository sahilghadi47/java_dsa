// You are given an integer array 'arr' of size 'N' and an integer 'K'.
// Your task is to find the total number of subarrays of the given array whose sum of elements is equal to k.
// A subarray is defined as a contiguous block of elements in the array.

// Example:
// Input: ‘N’ = 4, ‘arr’ = [3, 1, 2, 4], 'K' = 6
// Output: 2
package Arrays;

import java.util.HashMap;

public class countSubarrays {
    static int brute(int arr[] , int s){
        int count=0;
        int n =arr.length;
        for(int i =0;i<n;i++){
            int sum =arr[i];
            for(int j =i+1;j<n;j++){
                sum+=arr[j];
                if(sum ==s) {
                    count++;
                    sum=0;
                    break;
                }
            }
        }
        return count;
    }
    static int hashing(int arr[] ,int s){
        int count = 0;
        int sum = 0;
        HashMap <Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<arr.length ;i++){
            sum += arr[i];

            int rem = sum - s;

            count += map.getOrDefault(rem, 0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;       
    }
    public static void main(String[] args) {
        int arr[]= {3,1,2,4,6};
        System.out.println(hashing(arr, 7));;
    }
}
