package Search;


public class firstLastOccurance {
    static int first (int arr[], int k){
        int low =0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                res = mid;
                high = mid-1;
            } 
            else if(arr[mid] > k) high = mid-1;
            else low = mid+1;
        }
        
        return res;
    }
    static int last(int arr[] ,int k){
        int low = 0;
        int high = arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k) {
                res = mid;
                low = mid+1;
            }
            else if(arr[mid] > k) high = mid-1;
            else low = mid+1;
        }
        
        return res;
    }
    static int [] firstLast(int arr[] , int k){
        int first =first(arr, k);
        int last = last(arr, k);
        int ans []= new int[2];
        ans[0]= first;
        ans[1]=last;
        if(first ==-1 || last == -1) return new int[]{-1,-1};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,3,3,3,3,5,6};
        int ans[] = firstLast(arr,10);
        printArray.Sol(ans);
    }

}
