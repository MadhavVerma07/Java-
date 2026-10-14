import java.util.Scanner;

public class GCD
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter first number: ");
        Scanner sc1=new Scanner(System.in);
        a=sc1.nextInt();
        System.out.println("Enter second number :");
        Scanner sc2=new Scanner(System.in);
        b=sc2.nextInt();
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD of the numbers is:"+a);
    }
}