public class Problem03{
    class Employee{
        String ID ;
        String name ;
        double Basic ;

        public Employee( String i , String n , double b) {
            ID = i ;
            name = n ;
            Basic = b ;

        }
        void Gross(){
            double HRA = Basic/5 ;
            double DA = Basic/10 ;
            if(Basic>50000){
                double bonus = Basic/20 ;
                IO.print("The Gross salary of the Employee is ");
                IO.println(Basic+HRA+DA+bonus);
            }
            else{
                IO.print("The Gross salary of the Employee is ");
                IO.println(Basic+HRA+DA);
            }
        }
    };
    void main(){
        Employee E1 = new Employee("00122","Madhav Verma",60000);
        E1.Gross();

    }
    


}