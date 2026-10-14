import java.util.Scanner;

public class Nnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int number = 1; number <= n; number++) {
            System.out.print(number + " ");
        }
    }
}
