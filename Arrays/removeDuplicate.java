// Given an array of integers pf size n. give the no of unique integers inn array
package Arrays;

import java.util.HashSet;

public class removeDuplicate {
    public static int brute(int arr[] ,int n){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<n;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
    static int optimised (int arr[], int n){
        int i =0;
        for(int j =1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []arr = {11,11,22,22,22,22,33,33,44};
        System.out.println(optimised(arr,arr.length));
    }
}
