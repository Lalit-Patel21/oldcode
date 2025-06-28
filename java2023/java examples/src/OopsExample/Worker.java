package OopsExample;

public class Worker
{
    private int hw;
    private double payRate;

    public void setData(int h, double pay)
    {
        hw = h;
        payRate = pay;

    }

    public double getSalary()
    {
        double salary ;
        if (hw < 40)
            salary = hw * payRate;
        else
        {
            salary = 40 * payRate;
            hw -= 40;
            salary += 2 * hw * payRate;
        }
        return salary;
    }

}




