import java.util.*;

public class MultipleCount {
    public static void main(String[] args) {

        int[] input = {1,2,8,9,12,46,76,82,15,20,30};

        // Map to store divisor (1-9) and its count
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Initialize counts to 0
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count multiples
        for (int num : input) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    result.put(divisor, result.get(divisor) + 1);
                }
            }
        }

        // Print result
        System.out.println(result);
    }
}
