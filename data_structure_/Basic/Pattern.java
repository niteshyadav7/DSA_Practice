package Basic;

import java.util.Scanner;

public class Pattern {
    public static void rectangle1(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void rectangle2(int n) {

        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                int printed = row + col - 1;
                System.out.print(printed);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void triangle(int n) {
        int printed = 1;
        int row = 1;
        while (row <= n) {
            int col = 1;

            while (col <= row) {

                System.out.print(printed);
                printed += 1;
                col++;

            }
            System.out.println();
            row++;
        }
    }

    public static void alphabaticalRect(int n) {
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print((char) (64 + 1));
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // rectangle2(n);
        // triangle(n);
        alphabaticalRect(n);
    }
}
