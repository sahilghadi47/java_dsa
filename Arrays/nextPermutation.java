// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.


package Arrays;

public class nextPermutation {
    static void swap(int arr[] , int  i, int j) {
        int temp = arr[i];
        arr[i ] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[] , int str, int end){
        while(str < end){
            swap(arr, str, end);
            str++;
            end--;
        }
    }
    static int [] nextPermute(int arr[] ){
        int n = arr.length ;
        int idx = -1;
        for(int i = n-2 ; i>=0;i--){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(arr, 0, n-1);
            return arr;
        }
        for(int  i =n-1; i>idx ; i--){
            if(arr[i] > arr[idx]){
                swap(arr, idx, i);
                break;
            }
        }
        reverse(arr,idx+1,n-1);
        return arr;
    }

    public static void main(String [] args){
        int arr[] = {1,2,3};
        nextPermute(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

