import java.util.Scanner;

public class unique {

    public static void findUnique(int[] arr) {
    int n=arr.length;
        
            // Pick all elements one by one
            for (int i = 0; i < n; i++)
            {
                // Check if the picked element
                // is already printed
                int j;
                for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
         
                // If not printed earlier,
                // then print it
                if (i == j)
                System.out.print( arr[i] + " ");
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i <= input.length - 1; i++) {
            input[i] = sc.nextInt();
        }
        findUnique(input);
    }
}
