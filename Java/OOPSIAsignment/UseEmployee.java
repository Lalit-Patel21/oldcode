//17) Create a class Employee with(empNo ,salary and totalSalary)  with following features.
//Only parameterized constructor;
//totalSalary always represent total of all the salaries of all employees created.
//empNo should be auto incremented.
//display total employees and totalSalary using class method.

package OOPSIAsignment;

class Employee{
    private static int empNo=0;
    private int salary;
    private static int totalSalary;

    public Employee()
    {

    }
    public Employee(int salary)
    {
        this.salary=salary;
        totalSalary+=salary;
        empNo++;
    }
    public static void showDisplay(){
        System.out.println("Total Employees are : "+empNo);
        System.out.println("Total Salary "+totalSalary);
    }

}
public class UseEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(5000);
        Employee e2 = new Employee(5000);
        Employee e3 = new Employee(5000);
        Employee.showDisplay();
    }
}
