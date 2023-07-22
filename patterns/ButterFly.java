package patterns;

public class ButterFly {
    static void sol(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            int sp = 2 * (n - i);
            // star =i;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces = 2*(n-i);
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            // star =i;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.print("\n");
        }
        // 2nd half
        for (int i = n; i > 0; i--) {
            int sp = 2 * (n - i);
            // star =i;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces = 2*(n-i);
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            // star =i;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.print("\n");
        }

    }
}
