import java.util.Scanner;

public class IncreasingSequence {

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements and the increment value
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        // Initialize the array to store the sequence
        int[] b = new int[n];
        
        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        
        int moves = 0; // Counter for moves
        
        // Loop through the array to ensure it's strictly increasing
        for (int i = 1; i < n; i++) {
            // If the current element is not greater than the previous one
            if (b[i] <= b[i - 1]) {
                // Calculate how much we need to add to b[i]
                int required = b[i - 1] - b[i] + 1; // Must be greater than b[i-1]
                // Calculate how many moves are needed
                int increments = (required + d - 1) / d; // Ceiling division
                moves += increments; // Add to the move counter
                b[i] += increments * d; // Update the current element
            }
        }
        
        // Output the total moves needed
        System.out.println(moves);
        scanner.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
