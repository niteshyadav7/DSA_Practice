import java.util.Scanner;

public class prob06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fH=(n+1)/2;
        int sH=n/2;
        int i = 1;
        while (i <= fH - 2) {
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
             i =sH ;
        while (i > 0) {
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
            i--;
        }
    }
}
