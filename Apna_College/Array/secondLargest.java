public class secondLargest {
    public static void bubbleSort(int[] array) {
        int size = array.length;
        // and the other for comparison
        for (int step = 0; step < size - 1; ++step) {
            for (int i = 0; i < size - step - 1; ++i) {
                // To sort in descending order, change > to < in this line.
                if (array[i] > array[i + 1]) {
                    // swap if greater is at the rear position
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i], minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 6, 31, 14, 29, 44, 3 };
        // selectionSort(arr);
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println(arr[arr.length - 2]);
    }
}
