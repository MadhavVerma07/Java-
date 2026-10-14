public class Problem02{
    class BankAccount{
        private 
        String AcNo ;
        String Name ;
        int amount ;

        public BankAccount(String n , String a ){
            Name = n ;
            AcNo = a ;
            amount = 0 ;
        }
        public BankAccount(int a ){
            amount = a ;
        }
         void Deposite(int m ){
            amount += m ;
            IO.println("Money deposited");
            IO.print("the new balance of the account is : ");
            IO.println(amount);
        }
         void Withdraw(int m ){
        if(m>amount){
            IO.println("Not sufficient balance ");
        }
        else{
            IO.println("the money is withdrawed");
            amount=-m ;
        }
            IO.print("The available balance is ");
            IO.println(amount);

        
    }

    };
    void main() {
        BankAccount B1 = new BankAccount("Maddhav Verma ","001002");
        B1 = new BankAccount(10000);
        B1.Deposite(10000);
        B1.Withdraw(1000000);
    }
}