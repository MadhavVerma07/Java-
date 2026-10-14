import java.util.Scanner;

public class EvenNumber {
     void main() {
        IO.println("Enter a number of digits: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
