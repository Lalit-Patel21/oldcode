package Inheritance;

import SuperEx.Emp;

public class Employee {
    private String name;
    private double Salary;



    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
class Manager extends Employee {

    private double bonus;

    public void setBonus(double bonus) {
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
        Manager boss = new Manager();
        boss.setName("Ajay");
        boss.setSalary(50000);
        boss.setBonus(250000);
        System.out.println("manager's name :"+boss.getName());
        System.out.println("manager's total Income :"+boss.getIncome());
    }
}
