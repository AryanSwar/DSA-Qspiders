package DataStructure;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] prefix = new int[n];

        // First element
        prefix[0] = arr[0];

        // Build prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix sum
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
