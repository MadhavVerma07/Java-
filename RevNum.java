import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0 ;
        int remainder ;
        while(number>0){
            remainder = number%10 ;
            rev = rev*10 + remainder;
            number= number/10 ;
        }
        System.out.println(rev);
    }
}
