package patterns;

public class Triangle_char {

    static void sol(int n) {

        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(ch);

                ch++;
            }

            System.out.println();

        }

    }
}
