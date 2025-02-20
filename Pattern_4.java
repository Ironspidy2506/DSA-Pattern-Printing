import java.util.*;

// Pattern 4
// 1
// 12
// 123
// 1234

public class Pattern_4 {
    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number);
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
