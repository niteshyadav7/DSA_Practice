import java.util.Scanner;

public class inputTaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        // this loop for taking the input::
        for (int i = 0; i <= size - 1; i++) {
            input[i] = sc.nextInt();
        }
        // this loop for printing
        for (int i = 0; i <= input.length - 1; i++) {
            System.out.println(input[i] + " ");
        }

    }
}
