import java.util.TreeSet;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Create the set T as the set of all numbers from 2 to n
        TreeSet<Integer> T = new TreeSet<>();
        for (int i = 2; i <= n; i++) {
            T.add(i);
        }

        // Create the initially empty set S
        TreeSet<Integer> S = new TreeSet<>();

        // Set p to the value 2
        int p = 2;

        // Repeat until p^2 > n
        while (p * p <= n) {
            // Take all (non-trivial) multiples of p (i.e., 2p, 3p, ...) in S
            for (int multiple = 2 * p; multiple <= n; multiple += p) {
                S.add(multiple);
            }

            // If p still has the value 2, set p to 3, otherwise increase p by 2 until p is not in S
            if (p == 2) {
                p = 3;
            } else {
                do {
                    p += 2;  // Increment by 2 to skip even numbers
                } while (S.contains(p));  // Skip numbers already marked as non-prime
            }
        }

        // Remove all elements of the set S from the set T
        T.removeAll(S);

        // Output all elements of the set T (10 values in each line)
        int count = 0;
        for (int prime : T) {
            System.out.print(prime + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}