import java.util.Scanner;

public class LinearSearch {
    public static int LinearSearch(int[] arr, int x) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        int res = LinearSearch(input, x);
        System.out.println(res);

    }
}
