package Search;

public class peakElement {
    static int brute(int arr[] ){
        int n = arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i] > arr[i+1]) return i;
        }
        return -1;
    }

    static int optimised(int arr[]){
        int n = arr.length;
        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-2] < arr[n-1]) return n-1;
        int low =1;
        int high =n -2;

        while(low<= high){
            int mid = (low + high) /2;
            if(arr[mid] > arr[mid+1] && arr[mid-1]< arr[mid] ) return mid;
            if(arr[mid] > arr[mid -1]) high = mid -1;
            else low = mid +1; 
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1};
        System.out.println(brute(arr));
    }
}
