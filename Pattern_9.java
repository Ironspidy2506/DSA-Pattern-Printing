import java.util.*;

// Pattern 9
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class Pattern_9 {
    private static void printPattern(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            int prev = number;
            for (int j = 1; j <= i; j++) {
                System.out.print(prev + " ");
                prev = prev ^ 1;
            }
            number = number ^ 1;
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
