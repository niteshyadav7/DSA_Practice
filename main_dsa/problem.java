import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch='a';
        int arr[] = { 'a', 'b', 'c' };
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='b'){
                System.out.println(i);
            }
        }
    }
}
