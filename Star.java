import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter height of the triangle ");
         int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}