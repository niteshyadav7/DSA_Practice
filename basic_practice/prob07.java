import java.util.Scanner;

public class prob07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 1; i <= times; i++) {
            int num = sc.nextInt();
            int counter = 0;
            for (int j = 1; j  <= num; j++) {
                // System.out.println(j);
                if (num % j == 0) {
                    counter++;
                    // break;
                }
            }
            if (counter > 2) {
                System.out.println("Not Prime ");
            } else {
                System.out.println("Prime ");
            }
        }
    }
}
