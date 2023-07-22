package patterns;

public class Pyramid_half_InvertNum {

    static void sol(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j + " ");

            }

            System.out.print("\n");

        }
    }

}
