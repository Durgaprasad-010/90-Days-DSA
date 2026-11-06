
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {                     //pyramid pattern

            for (int j = 0; j < 2 * n + 1; j++) {

                if (j >= n - i && j <= n + i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
