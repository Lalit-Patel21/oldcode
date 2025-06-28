package OOPSIIasignment;

import java.util.Scanner;

class Faculty{
    private int facultyId;
    private double salary;


    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class FullTimeFaculty extends Faculty{
    private double basic;
    private double allowance;

    public FullTimeFaculty()
    {

    }
    public void inputForFullTimeFaculty()
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the FullTimeFaculty facultyId : ");
        this.setFacultyId( Sc.nextInt());

        System.out.print("Enter the FullTimeFaculty Basic Salary : ");
        basic = Sc.nextDouble();

        System.out.print("Enter the FullTimeFaculty  Allowance : ");
        allowance = Sc.nextDouble();

        setSalary(this.basic+this.allowance);

    }
    public void ShowDetailsOfFacultyFullTimeFaculty()
    {
        System.out.println();
        System.out.println("the FullTimeFaculty facultyId : "+this.getFacultyId());
        System.out.println("the FullTimeFaculty Basic Salary : "+this.basic);
        System.out.println("the FullTimeFaculty  Allowance "+this.allowance);
        System.out.println("the salary of FullTimeFaculty is: "+this.getSalary());
    }


}
class PartTimeFaculty extends Faculty{
    private double hour;
    private double rate;

    public PartTimeFaculty(){

    }

    public void inputForPartTimeFaculty()
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the PartTimeFaculty facultyId : ");
        this.setFacultyId( Sc.nextInt());


        System.out.print("Enter the PartTimeFaculty hour : ");
        hour = Sc.nextInt();

        System.out.print("Enter the PartTimeFaculty rate : ");
        rate = Sc.nextDouble();
        setSalary(this.rate*this.hour);

    }
    public void ShowDetailsOfFacultyPartTimeFaculty()
    {
        System.out.println();
        System.out.println("the PartTimeFaculty facultyId : "+this.getFacultyId());
        System.out.println("the PartTimeFaculty hour : "+this.hour);
        System.out.println("the PartTimeFaculty rate : "+this.rate);
        System.out.println("the salary of PartTimeFaculty is: "+this.getSalary());

    }
}
public class UseAllTimeFaculty {
    public static void main(String [] Args){

        FullTimeFaculty F1 = new FullTimeFaculty();
        F1.inputForFullTimeFaculty();

        FullTimeFaculty F2 = new FullTimeFaculty();
        F2.inputForFullTimeFaculty();


        PartTimeFaculty P1 = new PartTimeFaculty();
        P1.inputForPartTimeFaculty();


        PartTimeFaculty P2 = new PartTimeFaculty();
        P2.inputForPartTimeFaculty();


        F1.ShowDetailsOfFacultyFullTimeFaculty();
        F2.ShowDetailsOfFacultyFullTimeFaculty();
        P1.ShowDetailsOfFacultyPartTimeFaculty();
        P2.ShowDetailsOfFacultyPartTimeFaculty();

    }
}
