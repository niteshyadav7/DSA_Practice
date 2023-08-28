package loop;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 12345;
        int temp = num;
        int dig = 0;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            dig++;
        }
        while (num > 0) {
            int rem = num % 10;
            rev += rem * (int) (Math.pow(10, dig-1));
            dig--;
            num = num / 10;

        }
        System.out.println(rev);
    }
}
