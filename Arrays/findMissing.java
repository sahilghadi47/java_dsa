// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.




package Arrays;


public class findMissing {
    static int sol(int arr[] , int n){
        for(int i =0;i<n;i++){
            if(arr[i] <=0) arr[i] =n+1;
        }
        for(int i =0;i<n;i++){
            int idx = Math.abs(arr[i]) -1 ;
            if(idx < n){
                if(arr[idx] < 0) continue;
                else arr[idx] *= -1;
            }

        }
        for(int i =0;i<n;i++){
            if (arr[i] > 0) return i+1;
        }
        return n+1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,4};
        System.out.println(sol(arr, arr.length));
        boolean hash [] = new boolean[5];
        printArray.print(hash);    
    }
}
