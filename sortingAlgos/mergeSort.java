package sortingAlgos;

public class mergeSort {
    static void divide(int arr[], int si, int ei){
        int mid = si+ (ei-si)/2;

        if(si>=ei) return;

        //divide left
        divide(arr, si, mid);
        //divide right
        divide(arr,mid+1,ei);

        // conquere means add 
        conqure(arr, si, mid, ei);

    }
    static void conqure(int arr[],int si,int mid,int  ei){
        int [] merged = new int [ei - si +1];
        int indx1 = si;
        int indx2 = mid+1;
        int x =0;

        while(indx1 <= mid && indx2 <=ei){
            if(arr[indx1]< arr[indx2]){
                merged[x++] =arr[indx1++];
            }else{
                merged[x++] =arr[indx2++];
                
            }
        }
        while(indx1<= mid){
            merged[x++] = arr[indx1++];
            
        }
        while(indx2<= ei){
           
            merged[x++] =arr[indx2++];
            
        }
        for(int i =0 , j=si;i<merged.length; i++, j++){
            arr[j] =merged[i];
        }
        
    }
}
