import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num) {
            if (i % 2 == 0) {

                System.out.println(i);
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }

}
