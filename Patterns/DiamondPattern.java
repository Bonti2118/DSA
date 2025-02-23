public class DiamondPattern {
    public static void main(String[] args) {
        int row = 5; // Controls the size of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= row; i++) {
            // Print spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = row - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
