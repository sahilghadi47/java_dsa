package patterns;

public class Triangle_reverse {

    static void sol(int n) {

        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*\t");

            }

            System.out.print("\n");

        }

    }

}
