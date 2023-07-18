import java.util.Scanner;

// Print Square,trinagle

public class prob05 {

    public static void Square(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void triangle(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
        invertedTriangle(n);
    }

    public static void invertedTriangle(int n) {
        int i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void mirrorTriangle(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void brainStorming(int n) {
        int i = n;
        while (i>0) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Square(n);
        // triangle(n);
        // invertedTriangle(n);
        // mirrorTriangle(n);
        brainStorming(n);
    }
}
