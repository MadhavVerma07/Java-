import java.util.Scanner;
public class Fib{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter number of terms");
        int x = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int sum;
        for (int i = 0; i < x; i++) {
            System.err.print(n1 + " ");
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}