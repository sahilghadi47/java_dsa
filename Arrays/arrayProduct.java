package Arrays;
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.
// Int arr[] = {1,2,3,4}
// ans =  {24,12,8,6}
public class arrayProduct {
    static int []brute(int nums[]){
        int n = nums.length;
        int ans [] = new int[n];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j =0;j<n;j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            ans[i]=product;
        }
        return ans;
    }

    static int[] preSuf(int nums[]){
        int n =nums.length;
        int []prefix=new int[n];
        int []suffix=new int[n];
        int left=1;
        int right =1;

        for(int i =0;i<n;i++){
            prefix[i]=left;
            left*=nums[i];
        }
        for(int i =n-1;i>=0;i--){
            suffix[i]=right;
            right*=nums[i];
        }
        for(int i=0;i<n;i++){

            nums[i]=prefix[i]*suffix[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums []={1,2,3,4};
        int ans []= preSuf(nums);
        print.printArray(ans);
    }
}
