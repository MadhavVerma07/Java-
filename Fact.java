import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int fact=1;
        for (int number=n; number>0; number--) {
            fact=fact*number ;
             
        }
        System.out.println(fact);
    }
}
