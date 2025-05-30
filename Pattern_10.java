import java.util.*;

// Pattern 10
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class Pattern_10 {
    private static void printPattern(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
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
