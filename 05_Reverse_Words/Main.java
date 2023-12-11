public class Main {

    public static void main(String[] args) {
        // Create an instance of the class that contains the reverse method.
        Main tester = new Main();

        // Example character array
        char[] example = {'T', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};

        // Print the original array
        System.out.println("Original array: " + new String(example));

        // Call the reverse method with different parameters
        tester.reverse(example, 0, example.length - 1); // Reverse the entire array
        System.out.println("Reversed entire array: " + new String(example));
    }

    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
}
