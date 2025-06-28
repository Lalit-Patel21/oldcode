import java.util.Scanner;
class AddNos
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		String choice;
		do
		{
		  System.out.println("Enter 2 int:");
		  int a=kb.nextInt();
		  int b=kb.nextInt();
		  System.out.println("sum is "+(a+b));
		  System.out.println("Do you want to repeat(yes/no)");
		  kb.nextLine();// This is for clearing INPUT BUFFER
		  choice=kb.nextLine();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");
	}
}