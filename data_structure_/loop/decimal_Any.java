package loop;

import java.util.Scanner;

public class decimal_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        int rv = 0;
        int p = 1;
        while (num > 0) {
            int rem = num % base;
            num /= base;
            rv += rem * p;
            p *= 10;
        }
        System.out.println(rv);
    }
}
