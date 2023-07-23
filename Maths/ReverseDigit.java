package Maths;

public class ReverseDigit {
    static int sol(int n) {
        int ans = 0;

        while (n/10> 0) {

            int dig = n % 10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10)
                return 0;
            ans = dig + ans * 10;
            n /= 10;

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 1234056789;
        System.out.println(sol(n));
    }
}
