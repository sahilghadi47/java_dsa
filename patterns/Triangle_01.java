package patterns;

public class Triangle_01 {

    static void sol(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0)
                    System.out.print("1 ");
                if (sum % 2 == 1)
                    System.out.print("0 ");

            }

            System.out.println();

        }
    }
}
