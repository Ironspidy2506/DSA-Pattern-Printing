import java.util.*;

// Pattern 2
// ****
// ***
// **
// *

public class Pattern_2 {
    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
