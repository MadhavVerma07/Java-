import java.util.Scanner;
public class SumDigit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        int sum = 0 ;
        int remainder ;
        while(number>0){
            remainder = number%10 ;
            sum+=remainder ;
            number = number/10;
        }
        System.err.println("the sum of the digits is " + sum);
    }
} 