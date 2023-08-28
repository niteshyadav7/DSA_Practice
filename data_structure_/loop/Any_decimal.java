package loop;

import java.util.Scanner;

public class Any_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1172;
        int convert = 10;
        int rv = 0;
        int p = 1;
        while (num > 0) {
            int rem = num % convert;
            num /= convert;
            rv += rem * p;
            p *= 8;
        }
        System.out.println(rv);
    }
}
