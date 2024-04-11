// Task is to print all permutation of given array
//Ex = [1,2,3] 
// print [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]

package recursion;

import java.util.ArrayList;

public class permutation {
    static void swap(int arr[] , int i , int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    static void recuPermute(int arr[], ArrayList<ArrayList<Integer>> ans, int idx , int n){
      if(idx == n){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<n;i++){
          res.add(arr[i]);
        }
        ans.add(res);
        return ;
      }

      for(int i =idx; i <n ; i++){
        swap(arr, idx, i);
        recuPermute(arr, ans, idx+1, n);
        swap(arr, idx, i);
      }
    }
    static ArrayList<ArrayList<Integer>> permute(int arr[] , int n){
      ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
      recuPermute(arr, ans , 0, n);
      return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = permute(arr , arr.length);
        System.out.println(ans);
        ans.clear();
    }
}


