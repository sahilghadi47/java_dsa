// You are given an array of integers 'ARR' of length 'N' and an integer Target. Your task is to return all pairs of elements such that they add up to Target.
// Note:
// We cannot use the element at a given index twice.
package Arrays;

import java.util.HashMap;

public class twoSum {
    int[] brute(int arr[] ,int n){
        int[] ans={-1,-1};
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(n-arr[i]==arr[j]){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    int[] Hashing(int arr[], int target) {
        int ans[] = { -1, -1 };
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.containsKey(target - arr[i])) {
                ans[0] = hs.get(target - arr[i]);
                ans[1] = i;
                return ans;

            }
            hs.put(arr[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        twoSum ans= new twoSum();
        int arr[] = {1,0,2,4,7,1};
        int res [] = ans.brute(arr, 1);
        printArray.print(res);
    }
}
