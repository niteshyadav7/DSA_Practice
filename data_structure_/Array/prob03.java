package Array;

import java.util.Arrays;

public class prob03 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0, 0, 1, 2 };
        int countZeros = 0;
        int countOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZeros++;
            } else if (arr[i] == 1) {
                countOne++;
            }

        }

        for (int i = 0; i < countZeros; i++) {
            arr[i] = 0;
        }
        for (int i = countZeros; i < countOne + countZeros; i++) {
            arr[i] = 1;
        }
        for (int i = countOne + countZeros; i < arr.length; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
