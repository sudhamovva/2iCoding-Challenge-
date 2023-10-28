package Codepackage;
import java.util.HashSet;

public class PairSumFinder {
    public static int countPairsWithSum(int[] numbers, int X) {
        // Create a HashSet to store the unique numbers in the array
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Initialize a variable to keep track of the count of pairs
        int pairCount = 0;

        // Iterate through the array
        for (int number : numbers) {
            // Calculate the complement of the current number with respect to X
            int complement = X - number;

            // If the complement is in the set, it means we have found a pair
            if (seenNumbers.contains(complement)) {
                pairCount++;
                // Remove the complement from the set to ensure each number is used only once
                seenNumbers.remove(complement);
            }

            // Add the current number to the set
            seenNumbers.add(number);
        }

        return pairCount;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 3, 4, 1};
        int X = 7;

        int pairCount = countPairsWithSum(numbers, X);

        System.out.println("Number of pairs that sum to " + X + ": " + pairCount);
    }
}
