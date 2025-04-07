import java.util.Scanner;

public class bsg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input data
        int n = scanner.nextInt(); // Number of rows
        int m = scanner.nextInt(); // Number of columns
        int k = scanner.nextInt(); // Number of squares to break off

        scanner.close(); // Close the scanner

        int totalSquares = n * m;

        // Basic check: k must be positive and less than the total number of squares
        // The condition k != n * m is guaranteed by the problem statement,
        // but checking k < totalSquares implicitly covers it.
        if (k <= 0 || k >= totalSquares) {
            System.out.println("NO");
            return; // Exit if k is invalid
        }

        boolean possible = false;

        // --- Check Possibility 1: Horizontal Break ---
        // If we break horizontally, we break off 'i' rows.
        // The resulting piece has dimensions i x m.
        // We need k = i * m, which means k must be divisible by m.
        // Also, the number of rows broken off 'i' must be less than the total rows 'n'.
        // So, i = k / m must satisfy 1 <= i < n.
        // Since we already checked k > 0, k/m will be >= 1 if k % m == 0.
        // We only need to check k % m == 0 and k / m < n.
        if (k % m == 0) {
            int rowsToBreakOff = k / m;
            if (rowsToBreakOff < n) {
                possible = true;
            }
        }

        // --- Check Possibility 2: Vertical Break (only if horizontal wasn't possible) ---
        // If we break vertically, we break off 'j' columns.
        // The resulting piece has dimensions n x j.
        // We need k = n * j, which means k must be divisible by n.
        // Also, the number of columns broken off 'j' must be less than the total columns 'm'.
        // So, j = k / n must satisfy 1 <= j < m.
        // We only need to check k % n == 0 and k / n < m.
        if (!possible && k % n == 0) {
            int colsToBreakOff = k / n;
            if (colsToBreakOff < m) {
                possible = true;
            }
        }

        // --- Alternatively, combine the checks using logical OR ---
        // boolean possible = (k > 0 && k < totalSquares) &&
        //                    ((k % m == 0 && k / m < n) || (k % n == 0 && k / n < m));


        // Print the result
        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}