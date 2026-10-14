
import java.util.Scanner;

public class Prime{
     void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter the number");
        int n = scanner.nextInt();
        if(n==2){
            IO.println("it is not a prime number ");

        }
        if(n<1){
            System.out.println("Invalid input");
        }
        if(n>2){
            int x = 1;
            for(int i = 2; i < n; i++){
                if(n%i==0){
                    x=0;
                }
            }
            if(x==1){
                System.err.println("It is a prime Number");
            }
            else{System.err.println("It is not a prime number");}

        }
        

    }

}