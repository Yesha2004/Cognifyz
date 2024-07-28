import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
