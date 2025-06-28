class Student
{
    
     private int roll;
     private char grade;
     private double per;
 
     public void setStudent()
     {
         roll=10;
         grade='A';
         per=78.5;
     }
     public void showStudent()
     {
        System.out.println(roll+","+grade+","+per);
     }
}

class UseStudent
{
     public static void main(String [ ] args)
     {
                  Student S;
                  S=new Student();
                  S.setStudent();
                  S.showStudent();
                 
       }
}
