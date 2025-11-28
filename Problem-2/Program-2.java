import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a = sc.nextInt();

        // Generate odd numbers
        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;   // formula for ith odd number
            System.out.print(odd);

            if (i < a) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
