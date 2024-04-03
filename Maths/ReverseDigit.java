package Maths;

public class ReverseDigit {
    static int sol(int n) {
        
        int ans = 0;

        while( n!=0){
            int dig = n%10;
            n/=10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && dig > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && dig < -8)) return 0;
            ans = ans*10+ dig;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 123409;
        System.out.println(sol(n));
    }
}
