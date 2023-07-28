public class tripletSum {

    public static void tripletSum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int z = j + 1; z < arr.length; z++) {
                    if (arr[i] + arr[j] + arr[z] == 10) {
                        System.out.println(i + "," + j+","+z);
                        count++;
                    }

                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 2, -5, 8, -6, 0, 5, 10, 11, -3 };
        // int x = 10;
        tripletSum(arr);
    }
}
