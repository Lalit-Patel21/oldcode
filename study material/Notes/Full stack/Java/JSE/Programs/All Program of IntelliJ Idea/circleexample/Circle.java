package circleexample;

public class Circle {
    private int radius;


    public void setRadius(int r)
    {
        radius=r;
    }
    public double getArea()
    {
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }
    public double getCircumference()
    {
        double circ=2*Math.PI*radius;
        return circ;
    }
}
