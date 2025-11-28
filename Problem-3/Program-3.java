import java.util.Scanner;

public class OddSeriesLimit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        int a = sc.nextInt();

        // If a is even, reduce to previous odd number
        if (a % 2 == 0) {
            a = a - 1;
        }

        // Generate odd numbers up to a
        for (int odd = 1; odd <= a; odd += 2) {
            System.out.print(odd);

            if (odd + 2 <= a) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
