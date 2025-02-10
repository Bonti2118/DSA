public class RightAlignedTriangle {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
          
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
