import java.util.Scanner;
class Student
{
    
     private int roll;
     private String name;
     private double per;
 
     public void setStudent(int r,String str,double p)
     {
         roll=r;
         name=str;
         per=p;
     }
     public void showStudent()
     {
        System.out.println("Roll="+roll+",name="+name+",per="+per);
     }
}

class UseStudent
{
     public static void main(String [ ] args)
     {
                  Student S;
                  S=new Student();
                  Scanner kb=new Scanner(System.in);
                  int rl;
                  String nm;
                  double pr;
                  System.out.println("enter roll,name and per:");
 		  rl=kb.nextInt();
                  kb.nextLine();
                  nm=kb.nextLine();
                  pr=kb.nextDouble();
                  S.setStudent(rl,nm,pr);
                  S.showStudent();
                 
       }
}
