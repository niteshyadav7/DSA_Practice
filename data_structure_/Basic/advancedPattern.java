package Basic;

import java.util.Scanner;

public class advancedPattern {

    public static void prob1(int n) {
        int row = 1;
        while (row <= n) {
            int spaces = 1;
            while (spaces <= n - row) {
                System.out.print(" ");
                spaces++;
            }
            int col = 1;
            while (col <= row) {
                System.out.print("*");
                col++;
            }
            int last = 1;
            while (last <= row - 1) {
                System.out.print("*");
                last++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prob1(n);
    }
}
