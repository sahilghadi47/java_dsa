package Search;

public class NthRoot {
    static int findPower(int n, int m, int num){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans *= num;
            if(ans > m ) return 2;

        }
        if(ans == m) return 1;
        return 0;
    }
    static int BinarySearch(int n, int m){
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = low + (high - low)/2;
            int ans = findPower(n,m, mid);
            if( ans == 1) return mid;
            else if( ans == 0) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 2;
        int m = 81;
        System.out.println(BinarySearch(n, m));

    }
}
