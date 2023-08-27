package Basic;

import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 123456;
        int sumEven = 0;
        int sumOdd = 0;
        while (num != 0) {
            int rem = num % 10;

            if (rem % 2 == 0) {
                sumEven += rem;
            }
            if (rem % 2 != 0) {
                sumOdd += rem;
            }
            num /= 10;
            // System.out.print(rem);
        }
        System.out.println(sumEven + " " + sumOdd);
    }
}
