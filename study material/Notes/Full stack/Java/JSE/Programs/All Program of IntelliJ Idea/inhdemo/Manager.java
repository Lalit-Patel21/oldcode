package inhdemo;

public class Manager extends Emp{
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getTotalIncome(){

        double income;
        income=getSalary()+bonus;
        return income;

    }
}
