package SuperEx;

public class Emp {
    private String name;
    private double salary;

    public Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
class Manager extends Emp {

    private double bonus;


    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getIncome() {
        double total;
        total = getSalary() + bonus;
        return total;

    }
}
class UseManager{
    public static void main(String[] args) {
        Manager boss = new Manager("Ajay",50000.0,25000);
        System.out.println("manager's name :"+boss.getName());
        System.out.println("manager's total Income :"+boss.getIncome());
    }
}