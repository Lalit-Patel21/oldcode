import java.util.Scanner;
class Factorial
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int n,f;
		System.out.println("enter an int");
		n=kb.nextInt();
		for(f=1;n>1;n--)
			  f=f*n;

		System.out.println("Fact is "+f);
	}
}