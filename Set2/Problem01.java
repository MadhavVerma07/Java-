public class Problem01 {
        class Student{
            private
            String name ;
            int rollNo ;
            int marks1,marks2,marks3;
            
        public  
        Student( String n,int r){
            name = n ;
            rollNo = r ;

        }
        Student(int m1,int m2,int m3){
            marks1 = m1 ;
            marks2 = m2 ;
            marks3 = m3 ;

        }
        void Result(){
          int Total_marks= marks1+marks2+marks3;
          IO.print("Total marks of this student is :");
          IO.println(Total_marks);
          double Percentage = (marks1+marks2+marks2)/3;
          IO.print("The percentage of the student is : ");
          IO.println(Percentage);

          IO.print("The grade of the student is : ");
          if(Percentage>=90){
            IO.print("A grade");
          }
          else if (Percentage>70&&Percentage<90) {
              IO.print("B grade");    
          }
          else if (Percentage>50&&Percentage<70) {
            IO.print("c grade");   
          }
          else IO.print("Failed");
        }
        };
        void main() {
            Student S1= new Student("Madhav Verma",20);
            S1 = new Student(100,90,30);
            S1.Result();

        }

}