import java.util.*;

// Pattern 12
// A B C D E
// A B C D
// A B C 
// A B
// A

public class Pattern_12 {
    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
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
