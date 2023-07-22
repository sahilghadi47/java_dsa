package patterns;

public class Triangle {

    static void sol(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*\t");

            }

            System.out.print("\n");

        }

    }
    public static void main(String[] args) {
        sol(15);
    }

}
