import java.util.Scanner;

public class prob01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num <= 4) {
            System.out.println("Hello World!" + num);
            if (num < 2) {
                System.out.println("Namaste!");
                return;
            }
            num++;

        }
    }
}
