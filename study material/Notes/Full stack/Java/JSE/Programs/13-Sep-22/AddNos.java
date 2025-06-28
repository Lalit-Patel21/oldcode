import java.util.Scanner;
class AddNos
{
	public static void main(String [] args)
	{
		// Create a Scanner object and connect it with KB
		Scanner kb=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter first int:");
		a=kb.nextDouble();
		System.out.println("Enter secnd int:");
		b=kb.nextDouble();
		c=a+b;
		System.out.println("Sum is "+c);
	}
}
