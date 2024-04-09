package Arrays;

public class stocks1 {
//     Problem statement
// You are given an array/list 'prices' where the elements of the array represent the prices of the stock as 
// they were yesterday and indices of the array represent minutes. 
// Your task is to find and return the maximum profit you can make by buying and selling the stock.
// You can buy and sell the stock only once.
// Note:
// You can’t sell without buying first.

    int brute(int arr[] ){
        int n = arr.length;
        int diff = 0;
        int maxProfit =0;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[j]>arr[i]) diff = arr[j]-arr[i];

                if (diff> maxProfit) maxProfit = diff;
            }
        }
        return maxProfit;
    }

    int optimal(int arr[] ){
        int n = arr.length;
        int min = arr[0];
        int diff = 0;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < min )min = arr[i];
            if(arr[i] > min) diff =arr[i] - min;
            if(diff > maxProfit ) maxProfit = diff;
        }        
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,4,2,6,3};
        stocks1 ans = new stocks1();
        System.out.println(ans.optimal(arr));
    }
}
