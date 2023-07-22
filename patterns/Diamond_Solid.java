package patterns;

public class Diamond_Solid {

    static void sol(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces = n-i;
            // stars = 2n-1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            // spaces = n-i;
            // stars = 2n-1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
