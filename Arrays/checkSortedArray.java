//cheak whether given array is sorted or not

package Arrays;

public class cheakSortedArray{
    static boolean isSorted(int arr[], int n){
        boolean isSorted =false;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1])
               isSorted= true;
            else return false;
        }
        return isSorted;
    }
    public static void main(String args[]){

    int arr[]={1,2,3,4,5,6,7,8,9};
    System.out.println(isSorted(arr,arr.length));
  }
}
