import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
         Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        int rem ;
        
        while(num>0) {
            rem=num%10;
            num=num/10;
            System.out.println(rem);
        }
    }
}