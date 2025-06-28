import java.util.Scanner;
class Circle
{
	private int radius;
        
	
	public void setRadius(int r)
	{
		radius=r;
	}
	public void calculateArea()
	{
	   double area=Math.PI*Math.pow(radius,2);
	   System.out.println("Area is "+area);
	}
	public void calculateCircumference()
	{
	   double circ=2*Math.PI*radius;
	   System.out.println("Circumference is "+circ);
	}
}
class UseCircle
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int r;
		System.out.println("Enter radius:");
		r=kb.nextInt();
		Circle obj=new Circle();
		obj.setRadius(r);
		obj.calculateArea();
		obj.calculateCircumference();
	}
}
	
