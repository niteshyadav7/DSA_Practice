import java.util.Scanner;

public class sumOfArray {

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i <= arr.length - 1) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i <= input.length - 1; i++) {
            input[i] = sc.nextInt();
        }
        int result = sumOfArray(input);
        System.out.println(result);
    }
}
