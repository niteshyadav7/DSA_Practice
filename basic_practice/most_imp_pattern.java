import java.util.Scanner;

public class most_imp_pattern {

    public static void isoTriangle(int n) {
        int i = 1;
        while (i <= n) {
            int spc = 1;
            while (spc <= n - i) {
                System.out.print(" ");
                spc++;
            }
            int j = 1;
            int p = 1;
            while (j <= i) {
                // System.out.print(p);
                System.out.print("*");
                p++;
                j++;
            }
            p = i - 1;
            j = 1;
            while (j <= i - 1) {
                // System.out.print(p);
                System.out.print("*");
                p--;
                j++;
            }

            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isoTriangle(n);
    }
}
