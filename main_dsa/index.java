import java.util.Scanner;

public class index {

    public static int linerSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index" + i + ":" + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int[size];
        int key = sc.nextInt();
        // take input::
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        print(input);
        int index = linerSearch(input, key);
        if (index >= 0) {
            System.out.println("Number Exist at " + index);
        } else {
            System.out.println("Number not found.");
        }

    }
}
