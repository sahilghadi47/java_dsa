//find the largest element in th given array
package Arrays;

public class LargestElement {
  static int brute(int arr[]){
    //time complexity O(NlogN)
    Arrays.sort(arr);
    int n = arr.length-1;
    return arr[n];
  }
   static int optimised(int arr[] , int n){
      // time complexity = O(N)
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest)  largest =arr[i];
        }
        return largest;
  }


   public static void main(String[] args) {
    
        int arr[] = { 1, 2, 3, 4,25, 6, 7, 8, 9, 10 };
        System.out.println(brute(arr, arr.length));
        
  }


    
}
