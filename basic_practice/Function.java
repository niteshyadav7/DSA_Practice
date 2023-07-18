import java.util.Scanner;

public class Function {

    public static double avgAge(int a, int b) {
        double avgAge = (a + b) / 2;
        return avgAge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double age = avgAge(a, b);
        System.out.println(age);
    }
}
