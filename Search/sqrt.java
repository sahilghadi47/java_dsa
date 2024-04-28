package Search;
// You are given a positive integer ‘n’.
// Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).

public class sqrt {

    static int linearSearch(int n){
        int ans =0;
        for(long i = 1;i <= n/2;i++){
            if(i*i <= n) ans = (int)i;

        }
        return ans;
    }

    static int binarySearch(int n){
        long low =1;
        long high = n;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(mid == n/mid) return (int)mid;
            else if(mid < n/mid) low = mid +1;
            else high = mid-1;
        }
        return (int)high;
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(linearSearch(n));
        System.out.println(binarySearch(n));
    }
}
