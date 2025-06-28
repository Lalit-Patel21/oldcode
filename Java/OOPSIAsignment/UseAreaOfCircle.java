package OOPSIAsignment;

class AreaOfCircle{
    private double radius;
    private double area;

    public void init(double radius)
    {
        this.radius= radius;
    }
    public void Calc()
    {
        area=2*Math.PI*Math.pow(radius,2);
    }
    public void display()
    {
        System.out.println("The Area of circle is "+area);
    }
}
public class UseAreaOfCircle{
    public static void main(String []args){

        AreaOfCircle ac = new AreaOfCircle();

        ac.init(6);
        ac.Calc();
        ac.display();

    }
}



