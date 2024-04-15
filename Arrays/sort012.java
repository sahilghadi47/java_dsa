package Arrays;

public class sort012 {
    
    static void brute(int arr[]){
        // Arrays.sort(arr);
        

        int n= arr.length;
        int zero=0;
        int one=0;
        int two=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0) zero++;
            if(arr[i]==1) one++;
            if(arr[i]==2) two++;
        }
        int i ;
        for(i=0;i<zero;i++){
            arr[i]=0;
        }
        for(i=zero;i<zero+one;i++){
            arr[i]=1;
        }
        for(i=zero+one;i<zero+one+two;i++){
            arr[i]=2;
        }
    }

    static void optimised(int arr[]){
        //using 3 pointers
        //i.e low =cheak 0;
        //mid = cheak 1;
        //high = cheak 2;
        
        int low=0;
        int mid =0;
        int high = arr.length -1;
        while(mid<=high){
            if(arr[mid]==0){
                swap.sol(arr,low , mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }
            else{
                swap.sol(arr,mid ,high);
                high--;
            }
        } 
    }
    public static void main(String[] args) {
        int arr[] = {2,1,2,2,0,0,1,1};
        optimised(arr);
        printArray.print(arr);
    }
}
