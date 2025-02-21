import java.util.*;

// Pattern 14
// E
// D E
// C D E
// B C D E
// A B C D E

public class Pattern_14 {
    private static void printPattern(int n) {
        char ch = 'A';

        // char startChar = ch + n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
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
