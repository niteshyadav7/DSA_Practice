import java.util.Scanner;

public class prob01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i <= input.length - 1; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(input[i] + " ");
        }
    }
}