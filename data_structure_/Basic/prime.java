package Basic;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        for (int i = lower; i < upper; i++) {
            int counter = 0;
            for (int j = 2; j * j <= upper; j++) {
                if (i % j == 0 && i != j) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                System.out.println(i);
            }
            // System.out.println(i);
        }
    }
}
