import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        System.out.println("Enter a number of digits: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i ++) {
            sum += i;
        }
        System.out.println("Sum of N numbers from 0 to " + n + " is: " + sum);
    }
}
